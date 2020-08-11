package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void printMenu() {
        System.out.println("Select what you would like to do:");
        System.out.println("\t1) Quit");
        System.out.println("\t2) Print all contacts");
        System.out.println("\t3) Add new contact");
        System.out.println("\t4) Update existing contact");
        System.out.println("\t5) Remove contact");
        System.out.println("\t6) Search/find contact");
    }

    public void printAllContacts() {
        for(int i = 0; i < contacts.size(); i++) {
            System.out.println("Contact Name: " + contacts.get(0).getName() + "\tPhone Number: " + contacts.get(0).getPhoneNumber());
        }
    }

    public void addContact(String name, String phoneNumber) {

    }

}
