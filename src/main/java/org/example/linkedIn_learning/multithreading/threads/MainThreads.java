package org.example.linkedIn_learning.multithreading.threads;

public class MainThreads {
    public static void main(String[] args) {

        ThreadExample thr1 = new ThreadExample();
        thr1.setName("My first thread");
        thr1.start();

        ThreadExample thr2 = new ThreadExample();
        thr2.setName("My second thread");
        thr2.start();
    }
}
