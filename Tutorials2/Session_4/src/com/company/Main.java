package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double totalPrize = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to CodingBook Restaurant. Please enter your email address to order food.");
        String email = scanner.nextLine();
        System.out.println("What size pizza you would like to order: Small ($7.5), Medium ($8.5), Large ($9.5)?");
        String size = scanner.nextLine();
        System.out.println("What type of pizza you want: Cheese (+$2.0) or Pepperoni (+$5.0)?");
        String choice = scanner.nextLine();
        System.out.println("Which topping you want? (You can only have one more  topping)");
        System.out.println("Onion (+$1.75) \nMushroom (+$2.00) \nPineapple (+$3.75) \nChicken (+$4.75)");
        String topping = scanner.nextLine();
        totalPrize += sizePrize(size);
        totalPrize += choicePrize(choice);
        totalPrize += topping(topping);
        if(email.endsWith(".edu")) {
            double discount = totalPrize * 0.05;
            totalPrize = totalPrize - discount;
        }
        System.out.println("Your receipt is here. Total prize is: " + totalPrize);
    }

    public static double sizePrize(String size) {
        if(size.equalsIgnoreCase("small")) {
            return 7.5;
        } else if(size.equalsIgnoreCase("medium")) {
            return 8.5;
        } else if(size.equalsIgnoreCase("large")) {
            return 9.5;
        } else {
            return -1.0;
        }
    }

    public static double choicePrize(String choice) {
        if(choice.toLowerCase().equals("cheese")) {
            return 2.0;
        } else if(choice.toLowerCase().equals("pepperoni")) {
            return 5.0;
        } else {
            return -1.0;
        }
    }

    public static double topping(String topping) {
        double toppingPrice = 0.0;
        switch(topping.toLowerCase()) {
            case "onion":
                toppingPrice = 1.75;
                break;
            case "mushroom":
                toppingPrice = 2.0;
                break;
            case "pineapple":
                toppingPrice = 3.75;
                break;
            case "chicken":
                toppingPrice = 4.75;
                break;
            default:
                toppingPrice = -1.0;
        }
        return toppingPrice;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int bucketsBuy = 0;
        double area = width * height;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        bucketsBuy = (int) Math.ceil(area / areaPerBucket);
        if(bucketsBuy <= extraBuckets) {
            return 0;
        }
        return bucketsBuy - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int bucketsBuy = 0;
        double area = width * height;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        bucketsBuy = (int) Math.ceil(area / areaPerBucket);

        return bucketsBuy;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int bucketsBuy = 0;

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        bucketsBuy = (int) Math.ceil(area / areaPerBucket);

        return bucketsBuy;
    }

    public static void printSquareStar (int number) {
        int row;
        int column = 1;
        if(number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for(row = 1; row <= number; row++) {
            for(column = 1; column <= number; column++) {
                if(row == 1 || row == number) {
                    System.out.print("*");
                }
                else if(column == 1 || column == number){
                    System.out.print("*");
                }
                else if(row == column) {
                    System.out.print("*");
                } else if(column == (number - row + 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

                if(column == number) {
                    System.out.println();
                }
            }
        }
    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long average = 0;
        int number = 0;
        int totalNumber = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            boolean isInt = scanner.hasNextInt();
            if(isInt) {
                number = scanner.nextInt();
                totalNumber++;
                sum += number;
            }
            else {
                totalNumber++;
                average = sum/totalNumber;
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }

    public static int getLargestPrime(int number) {
        int bigPrime = 0;
        if (number < 0) {
            return -1;
        }

        for(int i = 2; i <= number; i++) {
            if(number % i == 0) {
                if(i == 2 || i == 3) {
                    bigPrime = i;
                }
                for(int j = 2; j <= i/2; j++) {
                    if(i % j == 0) {
                        break;
                    }
                    if(j == i/2){
                        bigPrime = i;
                        break;
                    }
                }
            }
        }
        if(bigPrime == 0) {
            return -1;
        }
        return bigPrime;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigMax = 0;
        int smallMax = 0;
        int remainingCount = 0;
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        for (int bigCounter = 1; bigCounter <= bigCount; bigCounter++) {
            if((goal / (bigCounter * 5)) >= 1) {
                bigMax = bigCounter;
            }
            else {
                break;
            }
        }

        remainingCount = goal - (bigMax * 5);
        if(remainingCount == 0) {
            return true;
        }

        for(int smallCounter = 1; smallCounter <= smallCount; smallCounter++) {
            if((remainingCount - smallCounter) == 0) {
                return true;
            }
        }

        return false;
    }

}
