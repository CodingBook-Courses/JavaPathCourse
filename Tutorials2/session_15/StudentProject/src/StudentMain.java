public class StudentMain {
    public static void main(String[] args){
        Student student1 = new Student("Nihan", 1, "Computer Science");
        Student student2 = new Student();
        student2.setName("Joe");
        student2.setID(2);
        student2.setMajor("Biology");

        System.out.println("Student1's name: " + student1.getName() + " id: "+ student1.getID() + " major" + student1.getMajor());
        System.out.println("Student2's name: " + student2.getName() + " id: "+ student2.getID() + " major" + student2.getMajor());
    }
}
