public class Laptop extends Computer{

    private String keyboard;
    private String touchPad;

    public Laptop(String owner, String brandName, int storage, String processor, int batteryLife, String keyboard, String touchPad) {
        super(owner, brandName, storage, processor, batteryLife);
        this.keyboard = keyboard;
        this.touchPad = touchPad;
    }

    @Override
    public void display(int width, int length) {
        super.display(width, length);
        System.out.println("Laptop have a huge display, than other computers except PC");
    }

    public void typeOnKeyboard() {
        System.out.println(super.getOwner() + " is typing on the keyboard " + keyboard);
    }

    public void touchPadClick() {
        System.out.println(super.getOwner() + " is now clicking the touchPad " + touchPad);
    }
}
