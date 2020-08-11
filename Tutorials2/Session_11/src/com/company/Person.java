package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            System.out.println("Invalid Age.");
        } else {
            this.age = age;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void isMinor() {
        if(age > 0 && age < 18) {
            System.out.println("You are a minor");
        }
        else if (age >= 18){
            System.out.println("You are an adult");
        } else {
            System.out.println("Invalid Age");
        }
    }

    public void isTeen() {
        if (age <= 19 && age >= 13) {
            System.out.println("You are a teenager");
        }
        else if (age < 13 && age > 0){
            System.out.println("You are not a teenager.");
        } else if( age > 19) {
            System.out.println("You are not a teenager");
        } else {
            System.out.println("Invalid Age");
        }
    }
}
