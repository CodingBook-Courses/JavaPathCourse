public class MobilePhone extends Phone{
    private int myPhoneNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myPhoneNumber) {
        super(myPhoneNumber);
    }

    @Override
    public boolean isPowerOn() {
        if(this.isOn) {
            return true;
        } else {
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
            System.out.println("We are now dialing " + phoneNumber + " from our mobile phone.");
        } else {
            System.out.println("The phone is switched off. Please turn on or charge the phone.");
        }
    }

    @Override
    public void answer() {
        if(isOn && isRinging) {
            System.out.println("Now answering the call from my mobile phone.");
            isRinging = false;
        } else {
            System.out.println("The phone is off or it's not ringing. False alarm.");
        }
    }

    @Override
    public void callPhone(int phoneNumber) {
        if(isOn) {
            this.isRinging = true;
            System.out.println("The phone is calling and it's ringing the tune.");
        } else {
            isRinging = false;
        }
    }
}
