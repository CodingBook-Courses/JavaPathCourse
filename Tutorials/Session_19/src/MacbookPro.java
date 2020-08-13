public class MacbookPro extends Laptop{
    private boolean isTouchBar;


    public MacbookPro(String owner, boolean isTouchBar) {
        super(owner, "Apple Macbook Pro", 1000, "Intel Core i5", 16, "Macbook keyboard", "Macbook TouchPad");
        this.isTouchBar = isTouchBar;
    }

    public void touchPadClick() {
        System.out.println(super.getOwner() + " clicked on the touchPad.");
    }

    public void usePhotoshop() {
        System.out.println(super.getOwner() + " is using photoshop.");
    }
}
