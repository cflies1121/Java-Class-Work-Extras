package com.example.main;

/**
 * Created by codysmac on 3/31/16.
 */
public class BankAccount {
    float balance;
//used of the default account
    public BankAccount(float balance){
        this.balance = balance;
    }
//used for the copy account
    public BankAccount(BankAccount balance){
        this.balance = balance.balance;
    }
}
