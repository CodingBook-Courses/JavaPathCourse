public class InterfaceMain {
    //Similar to abstract classes, but Interface are completely abstract
    //All methods does not have body (it only has method signatures)
    //By default, all methods are public and abstract
    //Class that implements interface, must implement all methods of the interface
    //Tell 'what' are the behavior (abstract), but no actual details on how those behaviors are performed ('how')
    //it cannot be instantiated
    //No constructor
    //You can have fields, but those fields has to be final and static

    public static void main(String[] args) {
        Animal sam = new Dog("Sam");
        Animal peacock = new Bird("Peacock");
        Animal sammy = new Cat("Sammy");

        sam.eat();
        peacock.eat();
        sammy.eat();

        sam.sleep();
        peacock.sleep();
        sammy.sleep();

        ((Dog)sam).eatAnimal(sammy);
        Animal bat = new Bat("Dragon");
        ((Bat)bat).fly();

    }
}
