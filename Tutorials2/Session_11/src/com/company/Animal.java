package com.company;

public class Animal {
    public String species;
    public int lifeExpectancy;
    public String name;

    public void speak() {
        System.out.println(name + " is speaking");
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void printDetail() {
        System.out.println("My name is " + name + ". My species is: " + species + " and it's life expectancy is " + lifeExpectancy );
    }
}
