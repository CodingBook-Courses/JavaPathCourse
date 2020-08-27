public class Cat extends Animal{ //Child class of Animal
    public void Eat(){ //Overriding
        System.out.println("Cat is eating");
    }
    public void Walk(){ //Overriding
        System.out.println("Cat is walking");
    }
    public String toString(){
        return "This is a cat class";
    }
}
