package samplepackage;

import com.company.Account;

public class SamplePackageClass {
    public static void main(String[] args) {
        Account newAccount = new Account();
        newAccount.setBalance(100);
        System.out.println(newAccount.getBalance());
        newAccount.withdraw(50);
    }
}
