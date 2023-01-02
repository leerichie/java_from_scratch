package org.example.linkedIn_learning.encapsulation;

public class BankingApp {
    public static void main(String[] args) {

        Banking accHolder1 = new Banking("Lee Richie", 1000);

        System.out.println(accHolder1); // balance

        accHolder1.deposit(300);  // deposit funds
        System.out.println(accHolder1);   // new balance

        accHolder1.withdraw(250); // withdraw funds
        System.out.println(accHolder1); // new balance
    }
}
