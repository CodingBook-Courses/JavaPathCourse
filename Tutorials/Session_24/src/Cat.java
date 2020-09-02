public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " is eating. I don't eat much.");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " is sleeping.");
    }
}
