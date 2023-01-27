package org.example.sda_materials.synchronized_threads;

import java.util.Random;

public class Lottery {
    boolean isDinnerReady;
    public synchronized void waitForDinner() throws InterruptedException {
        while (isDinnerReady) {
            wait(100);
        }
        System.out.println("Enjoy Your meal!");
    }

    public synchronized void prepareDinner() {
        System.out.println("Dinner preparing");
        isDinnerReady = true;
        notify();
    }
    public synchronized void start(int numberOfElements){
        Random random = new Random();
        for (int i=0; i<numberOfElements; i++){
            int number = random.nextInt(49) +1;
            System.out.println(Thread.currentThread().getName() + "-> pick " +
                    (i+1) + " is: " + number);
            System.out.print(i + " ");
            String st = String.format("%s -> number %d is: %d\n",
                    Thread.currentThread().getName(), i+1, number);
            System.out.println(st);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Lottery lottery = new Lottery();
        lottery.start(6);
//        lottery.isDinnerReady=true;
        lottery.prepareDinner();
        lottery.waitForDinner();


    }
}
