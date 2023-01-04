package org.example.linkedIn_learning.multithreading.synchronisation;

import java.util.Scanner;

public class BalanceInput {
    private int funds;
    Scanner input = new Scanner(System.in);

    public BalanceInput(int funds){
        this.funds = input.nextInt();
    }
}
