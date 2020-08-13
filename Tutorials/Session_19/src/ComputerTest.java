public class ComputerTest {
    public static void main(String[] args) {

        DellInspiron dellComputer = new DellInspiron("CodingBook", true);
        dellComputer.start();
        dellComputer.display(12, 10);
        dellComputer.playGame("Fall Guys");
        dellComputer.lookupTime();
        dellComputer.touchPadClick();
        dellComputer.typeOnKeyboard();
        dellComputer.turnOff();

        System.out.println("==========================================");
        MacbookPro mac = new MacbookPro("Chintan", false);
        mac.start();
        mac.display(12, 10);
        mac.lookupTime();
        mac.touchPadClick();
        mac.typeOnKeyboard();
        mac.usePhotoshop();
        mac.turnOff();

        System.out.println("=========================================");
        HPSpectre hp = new HPSpectre("James", true);
        hp.start();
        hp.display(12, 10);
        hp.lookupTime();
        hp.touchPadClick();
        hp.typeOnKeyboard();
        hp.drawOnScreen();
        hp.turnOff();

        System.out.println("=========================================");
        SmartPhone smart = new SmartPhone("Miranda", "Apple", 32, "Qualcomm", 6, 12);
        smart.start();
        smart.display(4, 6);
        smart.lookupTime();
        smart.callTo("Chintan");
        smart.receiveCall("CodingBook");
        smart.swipe();
        smart.turnOff();

        System.out.println("=========================================");
        SmartWatch watch = new SmartWatch("Michael" , "Samsung", 1, "Intel", 6);
        watch.start();
        watch.display(2, 2);
        watch.lookupTime();
        watch.heartRate();
        watch.turnOff();

    }
}
