package com.company;

public class Main {

    public static void main(String[] args) {

        //----------Using Account Class to create first object------------------
        Account samAccount = new Account();
        samAccount.setName("Sam");
        samAccount.setEmail("sam@codingbook.edu");
        samAccount.setPhone("999-999-9999");
        samAccount.setAccountNumber(123456);
        samAccount.setBalance(100);
        samAccount.deposit(55.05);
        samAccount.withdraw(100.5);
        samAccount.withdraw(90);
        //-----------------------------------------------------------------------

        //---------------------Calling area overloaded methods------------------------------------
        System.out.println("Area of a square with length 10 is: " + area(10.50));
        System.out.println("Area of a rectangle with length 100 and width 10 is: " + area(100.5, 10.99));
        //---------------------------------------------------------------------------------------

        //----------------------calling averageGrade overloaded methods----------------------
        averageGrade();
        averageGrade(98);
        averageGrade("Sam");
        averageGrade("Sam", 90);
        //-----------------------------------------------------------------------------------

        //---------------------Calling overloaded convertToKiloGrams methods-----------------------
        System.out.println(convertToKiloGrams(5, 100));
        System.out.println(convertToKiloGrams( 5, 10));
        System.out.println(convertToKiloGrams(17));
        //---------------------------------------------------------------------------------------

        //-----------------------Calling overloaded getTime methods-----------------------------
        System.out.println(getTime(61, 45));
        System.out.println(getTime(3661));
        System.out.println(getTime(1111, 11));
        //------------------------------------------------------------------------------------
    }

    //===========================================================================================================
    //===========================================================================================================

    //-------------------------------------Example of overloading method (1)-------------------------------------
    public static double area(double length) {
        return length * length;
    }

    public static double area(double length, double width) {
        return length * width;
    }
    // ------------------------------------------------------------------------------------------------------

    //------------------------------------Example of overloading method (2)--------------------------------------
    public static void averageGrade(String name, int percentage) {
        System.out.println(name + " has the percentage of " + percentage + " in the class");
    }

    public static void averageGrade(String name) {
        System.out.println(name + " has no percentage.");
    }

    public static void averageGrade(int percentage) {
        System.out.println("Unknown person has the percentage of " + percentage);
    }

    public static void averageGrade() {
        System.out.println("Unknown person has no percentage");
    }
    //-------------------------------------------------------------------------------------------------------

    //Create a method that takes pounds (lb) and ounces (oz) as an argument, and it should return its conversion to
    //kilograms (kg). Make sure to validate the argument passed. If lb is < 0, then give an error. If oz is < 0 or >= 16,
    //then give an error
    //1 lb = 16 ounces
    //1 oz = 0.02834952 kg

    //Create another method with the same name (and take oz as the argument), and convert it to kg too. Validate here too.
    //You have to convert the oz into lb first. And then call convertToKiloGrams(lb, oz) this method.

    //-----------------------------------------Example of Overloaded method (3)--------------------------------------
    public static double convertToKiloGrams(double lb, double oz) {
        if(lb < 0 || oz < 0 || oz >= 16) {
            System.out.println("Invalid value.");
            return 0;
        } else {
            double kg = (lb * 16) * 0.02834952;
            kg += oz * 0.02834952;

            return kg;
        }

    }

    public static double convertToKiloGrams(double oz) { //17
        if(oz < 0) {
            System.out.println("Invalid Value");
            return 0;
        } else {
            int lb = (int) oz / 16; //1
            double remainingOz = oz % 16; //1
            return convertToKiloGrams(lb, remainingOz);

        }
    }
    //------------------------------------------------------------------------------------------------------

    //-----------------------------------Example of overloaded method (4)-------------------------------------
    //Create a method getTime that takes two parameters minutes and seconds. Validate this method by checking
    //if minutes is >=0 or seconds is >=0 or seconds is <=60. If not, then give the error message. Else, return
    //the String that looks like this: For e.g.,
        //getTime(61, 45) --------> "01 hrs 01 min 45 sec"

    //Create another overloaded method that takes only second has a parameter. Validat this method by checking
    //if seconds is >=0. If not, then give the error message. Else, convert the seconds to minutes, and remaining
    // seconds. return the getTime(min, sec). The return String that looks like this: For e.g.,
        //getTime(3661) ---------> "01 hrs 01 min 01 sec"

    public static String getTime(int minutes, int seconds) {
        String time;
        if(minutes < 0 || seconds < 0 || seconds >= 60) {
            return "This is an invalid argument.";
        } else {
            int hours = (int) minutes / 60;
            int remainingMinutes = minutes % 60;
            time = String.format("%02dh %02dm %02ds", hours, remainingMinutes, seconds);
            return time;
        }
    }

    public static String getTime(int seconds) {
        if(seconds < 0) {
            return "This is an invalid argument.";
        } else {
            int minutes = (int) seconds / 60;
            int remainingSeconds = seconds % 60;
            return getTime(minutes, remainingSeconds);
        }
    }
    //--------------------------------------------------------------------------------------------------------

    //===========================================================================================================
    //===========================================================================================================
}
