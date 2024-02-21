public class LinkedList {

    private Node head;
    private int nodeCount = 0;

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            String str = "";
            return str = str + data;
        }
    }

    public void insert(int data) {
        Node temp = new Node(data);
        nodeCount++;

        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;

        }
    }

    public void append(int data) {

        Node temp = new Node(data);
        nodeCount++;

        if (head == null) {
            insert(data);
        } else {
            Node x = head;
            while (x.next != null) {
                x = x.next;
            }
            x.next = temp;
        }
    }

    public void insertByPosition(int data, int pos) {
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
                it = it.next;
                x++;
            }
            temp.next = it.next;
            it.next = temp;

        }

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node x = head;
            if (x.next != null) {
                head = x.next;
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
            itn = it.next;
            it.next = itp;
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
                x = x.next;
            }
        }
        return str;

    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        // System.out.println(list.nodeCount);
        list.append(65);
        list.append(75);
        // System.out.println(list.nodeCount);
        list.insert(50);
        list.deleteFirst();
        list.deleteFirst();
        // System.out.println(list.nodeCount);
        list.insertByPosition(45, 3);
        System.out.println(list);
        list.reverse();
        System.out.println(list);
        

    }

}
