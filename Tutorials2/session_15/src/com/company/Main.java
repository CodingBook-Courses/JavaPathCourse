package com.company;

public class Main {

    public static void main(String[] args) {

        //----------Using Account Class to create first object------------------
        System.out.println("Sam's Account info");
        Account samAccount = new Account("Sam", "sam@codingbook.edu", "999-999-9999", 123456, 100);
        System.out.println(samAccount.getName());
        System.out.println(samAccount.getEmail());
        System.out.println(samAccount.getPhone());
        System.out.println(samAccount.getAccountNumber());
        System.out.println(samAccount.getBalance());

        System.out.println("Nick account info:");
        Account nickAccount = new Account("Nick", "nick@codingbook.edu", "999-999-9999", 123457);
        System.out.println(nickAccount.getName());
        System.out.println(nickAccount.getEmail());
        System.out.println(nickAccount.getPhone());
        System.out.println(nickAccount.getAccountNumber());
        System.out.println(nickAccount.getBalance());

        System.out.println("Michael Account info:");
        Account michaelAccount = new Account("Michael", "michael@codingbook.edu", "999-999-9999");
        System.out.println(michaelAccount.getName());
        System.out.println(michaelAccount.getEmail());
        System.out.println(michaelAccount.getPhone());
        System.out.println(michaelAccount.getAccountNumber());
        System.out.println(michaelAccount.getBalance());

        System.out.println("Chintan account info:");
        Account chintanAccount = new Account("Chintan", "chintan@codingbook.org");
        System.out.println(chintanAccount.getName());
        System.out.println(chintanAccount.getEmail());
        System.out.println(chintanAccount.getPhone());
        System.out.println(chintanAccount.getAccountNumber());
        System.out.println(chintanAccount.getBalance());

        System.out.println("James account info:");
        Account jamesAccount = new Account("James");
        System.out.println(jamesAccount.getName());
        System.out.println(jamesAccount.getEmail());
        System.out.println(jamesAccount.getPhone());
        System.out.println(jamesAccount.getAccountNumber());
        System.out.println(jamesAccount.getBalance());

        System.out.println("Mrugami account info:");
        Account mrugamiAccount = new Account();
        System.out.println(mrugamiAccount.getName());
        System.out.println(mrugamiAccount.getEmail());
        System.out.println(mrugamiAccount.getPhone());
        System.out.println(mrugamiAccount.getAccountNumber());
        System.out.println(mrugamiAccount.getBalance());

    }

}
