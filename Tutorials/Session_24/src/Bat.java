public class Bat extends Animal implements ICanFly, Carnivore{

    public Bat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is now eating. Please don't disturb.");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " is not sleeping.");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is a mammal. But, I can fly.");
    }

    @Override
    public void eatAnimal(Animal animal) {
        System.out.println(this.getName() + " is eating ants.");
    }
}
