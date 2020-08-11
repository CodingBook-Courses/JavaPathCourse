package com.company;

public class Main {

    public static void main(String[] args) {
        Person sam = new Person();
        sam.setFirstName("Sam");
        sam.setLastName("Patel");
        sam.setAge(-10);
        sam.isMinor();
        sam.isTeen();
        Person andy = new Person();
        Person manuel = new Person();
        Person sandy = new Person();



    }

    private static int smallestNumberArray(int[] arr) {
        int smallestNumberFound = arr[0];
        for(int i = 0; i < arr.length - 1; i++) {
            if(smallestNumberFound > smallestNumber(arr[i], arr[i+1])) {
                smallestNumberFound = smallestNumber(arr[i], arr[i+1]);
            }
        }
        return smallestNumberFound;
    }


    public static int smallestNumber(int number1, int number2) {
        if(number1 < number2) {
            return number1;
        }
        return number2;
    }

    public static double square(double number) {
        return number * number;
    }

    public static void printStars(int height) {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


