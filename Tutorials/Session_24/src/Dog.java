public class Dog extends Animal implements Carnivore{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("I am carnivore. I am just eating right now.");
    }

    @Override
    public void eatAnimal(Animal animal) {
        System.out.println(this.getName() + " is eating " + animal.getName() + " because I am carnivore.");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " is sleeping. I love sleep.");
    }
}
