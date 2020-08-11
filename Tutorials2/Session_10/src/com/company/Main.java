package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printStars(6);
    }

    public static void printStars(int height) {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int findingTotalHi(String str) {
        String newStr = str.trim();
        int indexLocation = str.indexOf("Hi");
        if(indexLocation < 0) {
            return 0;
        }
        int numberOfHi = 1;
        newStr = newStr.substring(indexLocation + 2);
        while(true) {
            if(newStr.contains("Hi")) {
                numberOfHi++;
                indexLocation = newStr.indexOf("Hi");
                newStr = newStr.substring(indexLocation + 2);
            } else {
                break;
            }
        }
        return numberOfHi;
    }

    public static String[] fizzBuzz(int startIndex, int endIndex) {
        String[] arrayFizzBuzz = new String[endIndex - startIndex];
        int indexNo;
        for(int i = startIndex; i < endIndex; i++) {
            indexNo = i - startIndex;
            if(i % 3 == 0 && i % 5 == 0) {
                arrayFizzBuzz[indexNo] = "FizzBuzz";
            } else if(i % 3 == 0) {
                arrayFizzBuzz[indexNo] = "Fizz";
            } else if(i % 5 == 0) {
                arrayFizzBuzz[indexNo] = "Buzz";
            } else {
                arrayFizzBuzz[indexNo] = String.valueOf(i);
            }
        }
        return arrayFizzBuzz;
    }

    public static boolean containSix(int[] numbers) {
        int firstSixPosition = 0;
        boolean foundFirst = false;
        int secondSixPosition = 0;
        int numberOfSix = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 6) {
                numberOfSix++;
                if(!foundFirst) {
                    firstSixPosition = i;
                    foundFirst = true;
                } else {
                    secondSixPosition = i;
                    if((secondSixPosition - firstSixPosition) == 1) {
                        return false;
                    }
                }
            }
            if(numberOfSix > 2) {
                return false;
            }
        }
        return secondSixPosition != 0;
    }

//    public static boolean containString(String first, String second) {
//        int increment = 0;
//        char letter = second.charAt(increment);
//        int indexOfFirstString = 0;
//        while(true) {
//            for(int j = indexOfFirstString; j < first.length(); j++) {
//                letter = second.charAt(increment);
//                if(first.charAt(j) == letter) {
//                    System.out.println("First character " + first.charAt(j) + " == Second Character " + letter);
//                    increment++;
//                    indexOfFirstString = j + 1;
//                    System.out.println(increment);
//                    break;
//                }
//                if(j == first.length() - 1 && increment < second.length() - 1) {
//                    System.out.println("Value j: " + j + ". First length - 1: " + (first.length() - 1) + " Increment: " + increment
//                    + " Second Length - 1 " + (second.length() - 1));
//                    if(increment < second.length() - 2) {
//                        return false;
//                    } else {
//                        return false;
//                    }
//                }
//            }
//        }
//    }
}
