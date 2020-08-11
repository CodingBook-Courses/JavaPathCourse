//super vs this keyword
//super keyword is used to access methods of the parent class
//this keyword is used to access the current class.

public class Bird {
    public String name;
    public int age;

    public Bird(String n, int a){
        this.name = n;
        this.age = a;
    }
    public void eat(){
        System.out.println("The bird ate");
    }
    public void fly(){
        System.out.println("The bird flew.");
    }
}
