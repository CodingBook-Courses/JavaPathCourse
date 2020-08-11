public class Student {
    private String name;
    private int ID;
    private String major;


    Student(){

    }
    Student(String n, int i, String m){
        this.name = n;
        this.ID = i;
        this.major = m;
    }

    public String getName(){
        return this.name;
    }
    public int getID(){
        return this.ID;
    }
    public String getMajor(){
        return this.major;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setID(int i){
        this.ID = i;
    }
    public void setMajor(String m){
        this.major = m;
    }
    public void change(Student x){
        x.setName("Hello");
    }
}


//    Add getters and setters
//    Create another student called Student2 using a default constructor
//    Set the student’s name, id, and major using the setters
//    Print both students’ information using the getters

