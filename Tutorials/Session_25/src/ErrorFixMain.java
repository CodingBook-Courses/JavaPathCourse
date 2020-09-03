import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorFixMain {
    public static void main(String[] args) {
        //Two main approaches when dealing with errors:

        //1) LBYL - Look before you Leap
        //2) EAFP - Easy to Ask for Forgiveness than Permission

        int num = getIntUsingEAFP();
        int den = getIntUsingEAFP();

//        System.out.println(divisionUsingEAFP(num, den));
        System.out.println("num is " + num + " and den is " + den);
        System.out.println(divisionUsingEAFP(num, den));

//        System.out.println(division(10, 5));
//        System.out.println(division(5, 0));
//
//        System.out.println(divisionUsingLBYL(10, 5));
//        System.out.println(divisionUsingLBYL(5,0));
//
//        System.out.println(divisionUsingEAFP(10, 5));
//        System.out.println(divisionUsingEAFP(5,0));
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        return scanner.nextInt();
    }

    private static int getIntUsingLBYL() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Enter integer value: ");
        String input = scanner.next();
        for(int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        } else {
            System.out.println("Suppose to enter integer. Failed.");
        }
        return 0;
    }

    public static int getIntUsingEAFP() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        }catch(InputMismatchException exception) {
            System.out.println("Suppose to enter integer. Failed.");
            return 0;
        }
    }

    public static double division(double num, double den) {
        return num/den;
    }

    public static double divisionUsingLBYL(double num, double den) {
        if(den != 0) {
            return num/den;
        } else {
            return 0;
        }
    }

    public static int divisionUsingEAFP(int num, int den) {
        try {
            return num/den;
        } catch(ArithmeticException exception) {
            System.out.println("Denominator cannot be zero");
            return 0;
        }
    }
}
