public class Person {
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setAge(int a){
        this.age = a;
    }
    public void change(Person p){
        p.setName("Hello");
    }
}
