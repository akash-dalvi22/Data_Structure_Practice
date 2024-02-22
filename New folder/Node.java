public class Node {
    private Student data;
    private Node next;

    public Node(Student data) {
        this.data = data;
        this.next = null;
    }

    // setter method to set data and next part
    public void setData(Student data){
        this.data = data;
    } 
    public void setNext(Node next){
        this.next = next;
    }
    // getter methods for get data and address of next node/part
    public Student getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }

    public String toString() {
        String str = "";
        return str = str + data;
    }
}
