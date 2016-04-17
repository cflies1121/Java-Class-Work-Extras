package com.example.main;

/**
 * Created by codysmac on 3/31/16.
 */
public class Main {

    public static void main(String[] args) {
        BankAccount aaccount = new BankAccount(25);//creates a default account
        BankAccount baccount = new BankAccount(aaccount);//creates a copy of the first account object
        System.out.println(baccount.balance);//prints out the copy to prove the number copied over
    }
}
