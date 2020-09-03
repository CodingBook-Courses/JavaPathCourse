import java.util.InputMismatchException;
import java.util.Scanner;

public class MainException {
    public static void main(String[] args) {
        //Exception: Problem that occurs during the execution of the program, i.e., while the program is running
        //or during the run-time phase
            //E.g. invalid data provided by the user, JVM runs out of memory, NullPointerException, ArithmeticException
            //ArrayIndexOutOfBoundException, IOException,
        //We can handle it using try-catch blocks or we can use throw/s keyword

        //try: code that raises exception is inside try block
        //catch: catches the thrown exception (code inside catch is used for exception handling). You can actually have
            //multiple catch
        //throw: this keyword throws exception (throws either inbuilt exception that are extending from Exception class or
            //user defined exception
        //throws: it handles checked exceptions only. Used in the signature of a method to indicate that this method
            //might throw an exception. Caller has to handle this exception using try-catch. This keyword only
            //convince compiler about the exception, but can still abnormally terminates the program.
            //Main idea is that it indicates the caller about the exception.

        try {
            int value = getIntUsingEAFP();
            System.out.println("The value is " + value);
        } catch(Exception e) {
            System.out.println("Need to enter integers only.");
        }

        int value = getInt();
        System.out.println(value);
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        return scanner.nextInt();
    }

    public static int getIntUsingEAFP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        while(true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                System.out.println("Only integer values allowed. Please try again: ");
            }
        }
    }
}
