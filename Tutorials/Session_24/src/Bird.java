public class Bird extends Animal implements ICanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " loves eating. I don't eat much though. I am pecking.");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " sleeps well. I am sleeping now.");
    }

    @Override
    public void fly() {
        System.out.println("I am swinging my wings. I am about to fly.");
    }
}
