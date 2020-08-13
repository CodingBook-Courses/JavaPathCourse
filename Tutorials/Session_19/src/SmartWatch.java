public class SmartWatch extends Computer{

    public SmartWatch(String owner, String brandName, int storage, String processor, int batteryLife) {
        super(owner, brandName, storage, processor, batteryLife);
    }

    public void heartRate() {
        System.out.println(getOwner() + " is checking heart rate using the smartwatch " + getBrandName());
    }

    @Override
    public void display(int width, int length) {
        super.display(width, length);
        System.out.println("SmartWatch have the display of the size of a watch.");
    }
}
