public class LinkedList {

    private Node head;
    private int nodeCount = 0;

    public void insert(Student data) {
        Node temp = new Node(data);
        nodeCount++;

        if (head == null) {
            head = temp;
        } else {
            temp.setNext(head);
            head = temp;

        }
    }

    public void append(Student data) {

        Node temp = new Node(data);
        nodeCount++;

        if (head == null) {
            insert(data);
        } else {
            Node x = head;
            while (x.getNext() != null) {
                x = x.getNext();
            }
            x.setNext(temp);
        }
    }

    public void insertByPosition(Student data, int pos) {
        if (pos == 1) {
            insert(data);
        } else if (pos == nodeCount + 1) {
            append(data);

        } else if (pos <= 0 || pos > nodeCount + 1) {
            System.out.println("Invalid position");
        } else {
            Node temp = new Node(data);
            nodeCount++;
            Node it = head;
            int x = 1;
            while(x<pos-1){
                it = it.getNext();
                x++;
            }
            temp.setNext(it.getNext());
            it.setNext(temp);

        }

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node x = head;
            if (x.getNext() != null) {
                head = x.getNext();
                nodeCount--;
            } else {
                head = null;
                nodeCount--;
            }
        }

    }
    public void reverse(){
        Node it = head;
        Node itp = null;
        Node itn = it;
        while(it != null){
            itn = it.getNext();
            it.setNext(itp);
            itp = it;
            it = itn;
        }
        head = itp;
    }

    public String toString() {
        String str = "";
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node x = head;
            while (x != null) {
                str = str + " " + x + "-->";
                x = x.getNext();
            }
        }
        return str;

    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        Student stud1 = new Student(1, "Akash", "Dalvi");
        list.insert(stud1);
        Student stud2 = new Student(2, "Vaishnav", "Wagh");
        list.insert(stud2);
        Student stud3 = new Student(3, "Shubham", "Dalvi");
        list.append(stud3);
       
        System.out.println(list);
        

    }

}
