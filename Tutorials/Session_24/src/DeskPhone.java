public class DeskPhone extends Phone{

    private int myPhoneNumber;
    private boolean isRinging;
    private boolean isOn;

    public DeskPhone(int myPhoneNumber) {
        super(myPhoneNumber);
    }

    @Override
    public boolean isPowerOn() {
        if(isOn) {
            System.out.println("Desk phone plugged to the electric socket. The phone is on now.");
            return true;
        } else {
            System.out.println("Desk phone is not plugged in. It is off.");
            return false;
        }
    }

    @Override
    public void setPowerOn(boolean powerOn) {
        this.isOn = powerOn;
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("We are now dialing " + phoneNumber + " on our desk phone.");
            isRinging = true;
        }
    }

    @Override
    public void answer() {
        if(isRinging && isOn) {
            System.out.println("We are answering the desk phone.");
            this.isRinging = false;
        }
    }

    @Override
    public void callPhone(int phoneNumber) {
        if(isOn) {
            isRinging = true;
            System.out.println("Phone is calling now to " + phoneNumber);
        }
    }
}
