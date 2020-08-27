public class Main {
    public static void main(String args[]){
        //Simply calling all the methods
        Animal animal1 = new Animal();
        animal1.Eat();
        animal1.Walk();

        Cat cat1 = new Cat();
        cat1.Eat();
        cat1.Walk();
        cat1.toString();

        Dog dog1 = new Dog();
        dog1.Eat();
        dog1.Walk();
        dog1.toString();

        Bulldog bulldog1 = new Bulldog();
        bulldog1.Eat();
        bulldog1.Walk();
        bulldog1.toString();
    }
}
