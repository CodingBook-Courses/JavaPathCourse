public class SmartPhone extends Computer{

    private int cameraPixels;

    public SmartPhone(String owner, String brandName, int storage, String processor, int batteryLife, int cameraPixels) {
        super(owner, brandName, storage, processor, batteryLife);
        this.cameraPixels = cameraPixels;
    }

    public void swipe() {
        System.out.println(super.getOwner() + " swiped on the phone " + super.getBrandName());
    }

    public void callTo(String receiver) {
        System.out.println(super.getOwner() + " calling " + receiver);
    }

    @Override
    public void display(int width, int length) {
        super.display(width, length);
        System.out.println("The display of the smartphones are small.");
    }

    public void receiveCall(String sendor) {
        System.out.println(super.getOwner() + " is getting the call from " + sendor);
    }
}
