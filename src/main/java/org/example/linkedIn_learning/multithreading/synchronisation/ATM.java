package org.example.linkedIn_learning.multithreading.synchronisation;

import java.util.Scanner;

public class ATM {

    static synchronized void withdraw(BankAccount account, int amount){ // synchronized - controls access of multiple threads
        int balance = account.getBalance();
        if ((balance - amount) < -account.getOverdraft()){
            System.out.println("Transaction denied");
        } else {
            account.debit(amount);
            System.out.println("£ " + amount + " successfully withdrawn.");
        }
        System.out.println("Current balance " + account.getBalance());
    }

}
