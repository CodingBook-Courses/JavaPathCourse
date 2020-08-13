public class Computer {
    private String owner;
    private String brandName;
    private int storage;
    private String processor;
    private int batteryLife;

    public Computer(String owner, String brandName, int storage, String processor, int batteryLife) {
        this.owner = owner;
        this.brandName = brandName;
        this.storage = storage;
        this.processor = processor;
        this.batteryLife = batteryLife;
    }

    public void start() {
        System.out.println("Computer starting.");
        System.out.println("Logo of the brand name appears.");
        System.out.println("Computer is available for the user to use.");
    }

    public void turnOff() {
        System.out.println("Computer is shutting down.");
        System.out.println("Logo is appearing.");
        System.out.println("The screen is blank. The computer is turned off.");
    }

    public void lookupTime() {
        System.out.println("The current time is: 8:10 PM EDT");
    }

    public void display(int width, int length) {
        System.out.println("The width is: " + width + " inches, and length is: " + length + " inches.");
    }

    public String getOwner() {
        return owner;
    }

    public String getBrandName() {
        return brandName;
    }
}
