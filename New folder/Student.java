public class Student {

    private int id;
    private String fName;
    private String lName;

    public Student(int id,String fName, String lName){
        this.id= id;
        this.fName = fName;
        this.lName = lName;
    }
    public String toString(){
        return this.id+" "+this.fName+" "+this.lName;
    }
    
}
