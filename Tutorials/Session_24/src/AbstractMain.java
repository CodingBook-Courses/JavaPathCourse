public class AbstractMain {
    //Abstraction is hiding unnecessary details and showing the essentials
    //Abstract class -> restricted class because you cannot create an object of this class
    //The way you call it is that you inherit this abstract class, and then you access it from there
    //Abstract methods -> There is no body (You just declare it, but don't define it)
    //Needs to be implemented in the child class
    //If you do not implement methods of the abstract class in the child class, then this child class also needs
    //to be made abstract

    public static void main(String[] args) {
        Phone myDeskPhone = new DeskPhone(1234567890);
        myDeskPhone.setPowerOn(true);
        myDeskPhone.isPowerOn();
        myDeskPhone.dial(987654321);
        myDeskPhone.callPhone(987654321);
        myDeskPhone.answer();

        Phone myMobilePhone = new MobilePhone(1234567890);
        myMobilePhone.setPowerOn(true);
        myMobilePhone.isPowerOn();
        myMobilePhone.dial(987654321);
        myMobilePhone.callPhone(987654321);
        myMobilePhone.answer();

    }
}
