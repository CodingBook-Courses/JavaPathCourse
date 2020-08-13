public class HPSpectre extends Laptop{
    private boolean isTouchPen;

    public HPSpectre(String owner, boolean isTouchPen) {
        super(owner, "HP Spectre", 512, "Intel Core i5", 8, "HP keyboard", "HP touchpad");
        this.isTouchPen = isTouchPen;
    }

    public void drawOnScreen() {
        if(isTouchPen) {
            System.out.println(getOwner() + " is drawing on the screen using touch pen.");
        } else {
            System.out.println("This HP Spectre does not have a touch screen.");
        }
    }
}
