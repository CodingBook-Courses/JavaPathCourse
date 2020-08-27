//Composition -> it used to implement has-a relationship
//It is achieved by using instance variables that refers
//to other objects
public class Comp_Class {
    public static void main(String args[]){
        Owner owner1 = new Owner("Jake", 26);
        Cat cat1 = new Cat("Jess", owner1);
        System.out.println(cat1);

    }
}
