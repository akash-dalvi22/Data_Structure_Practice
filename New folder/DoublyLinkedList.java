public class DoublyLinkedList {

    private Node head;
    private int nodeCount = 0;

    public DoublyLinkedList() {
        head = null;
    }

    private class Node {

        private int data;
        private Node next;
        private Node prev;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public String toString() {
            String str = "";
            str = str + " " + data;
            return str;
        }
    }

    public void insert(int data) {

        Node temp = new Node(data);
        nodeCount++;

        if (head == null) {

            head = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    public void append(int data) {

        Node temp = new Node(data);
        nodeCount++;

        if (head == null) {
            head = temp;
        } else {
            Node it = head;
            while (it.next != null) {
                it = it.next;
            }
            it.next = temp;
            temp.prev = it;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("LL is Empty");
        } else if (head.next == null) {
            head = null;
            nodeCount--;
        } else {
            Node it = head;
            head = it.next;
            it.next.prev = null;
            it.next = null;
            it = null;
            nodeCount--;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("LL Is Empty");
        } else if (head.next == null) {
            head = null;
            nodeCount--;
        } else {
            Node it = head;
            Node itp = null;

            while (it.next != null) {
                itp = it;
                it = it.next;

            }
            itp.next = null;
            it.prev = null;
            it = null;
            nodeCount--;
        }
    }

    public void insertByPosition(int data, int pos){
        if(pos == 1){
            insert(data);
        } else if(pos == nodeCount+1){
            append(data);
        } else if(pos <= 0 || pos > nodeCount+1){
            System.out.println("Invalid Position");
        }
        else{
            Node temp = new Node(data);

            Node it = head;
            int x = 1;
            while (x != pos-1) {
                it = it.next;
                x++;
            }
            temp.next = it.next;
            it.next.prev = temp;
            it.next = temp;
            temp.prev = it;
            nodeCount++;

        }

    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(10);
        dll.insert(20);
        dll.insert(65);
        dll.append(45);
        dll.append(50);
        // dll.deleteFirst();
        // dll.deleteFirst();
        // dll.deleteLast();
        dll.insertByPosition(69, 3);

        System.out.println(dll);
    }

    public String toString() {
        String str = "";

        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node it = head;
            while (it != null) {
                str = str + " " + it + "-->";
                it = it.next;
            }
        }
        return str;
    }

}
