public class Owner {
    String name;
    int age;

    public Owner(String n, int a){
        this.name = n;
        this.age = a;
    }

//    public String getName() {
//        return name;
//    }

    public String toString(){
        return "The Owner's name is: " + this.name + " and the owner's age is: " + this.age;
    }
}
