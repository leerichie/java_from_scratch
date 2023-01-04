package org.example.linkedIn_learning.multithreading.synchronisation;

import java.util.Scanner;

public class BankAccount {

    private int balance;
    private int overdraft;

    public BankAccount(int balance, int overdraft) {
        this.balance = balance;
        this.overdraft = overdraft;
    }
    void topUp(int amount){
        balance += amount;
    }
    void debit(int amount){
        balance -= amount;
    }
    int getBalance(){
        return balance;
    }
    int getOverdraft(){
        return overdraft;
    }
}
