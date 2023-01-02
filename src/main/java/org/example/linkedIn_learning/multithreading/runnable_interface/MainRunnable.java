package org.example.linkedIn_learning.multithreading.runnable_interface;

public class MainRunnable {
    public static void main(String[] args) {

        Thread thr1 = new Thread(new RunnableExample());
        thr1.start();

        Thread thr2 = new Thread(() -> {
            int i = 1;
            while (i <= 100) {
                System.out.println(i + " " + Thread.currentThread().getName());
                i++;
            }
        });
        thr2.start();
    }
}
