public class DellInspiron extends Laptop{
    private boolean isTouchScreen;

    public DellInspiron(String owner, boolean isTouchScreen) {
        super(owner, "Dell Inspiron", 2000, "Intel Core i7", 10, "Dell keyboard", "Dell touchpad");
        this.isTouchScreen = isTouchScreen;
    }

    @Override
    public void display(int width, int length) {
        super.display(width, length);
        System.out.println("This is the display for Dell Inspiron");
    }

    public void playGame(String name) {
        System.out.println(getOwner() + " is playing the game " + name);
    }
}
