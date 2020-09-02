public abstract class Phone {

    private int myPhoneNumber;
    private boolean isPowerOn;
    private boolean isRinging;

    public Phone(int phoneNumber) {
        this.myPhoneNumber = phoneNumber;
    }

    public int getMyPhoneNumber() {
        return myPhoneNumber;
    }

    public void setMyPhoneNumber(int myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }

    public abstract boolean isPowerOn();

    public abstract void setPowerOn(boolean powerOn);

    public boolean isRinging() {
        return isRinging;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public abstract void dial(int phoneNumber);

    public abstract void answer();

    public abstract void callPhone(int phoneNumber);
}
