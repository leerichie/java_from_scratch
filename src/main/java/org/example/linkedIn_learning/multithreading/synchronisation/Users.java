package org.example.linkedIn_learning.multithreading.synchronisation;

import java.util.Scanner;

public class Users {

    static final BankAccount account = new BankAccount(300, 50);

    public static void main(String[] args) {

//        account.topUp();

        Thread t1 = new Thread(() -> ATM.withdraw(account, 400));

//        Thread t2 = new Thread(()-> ATM.withdraw(account, 100));

        t1.start();
//        t2.start();
    }
}
