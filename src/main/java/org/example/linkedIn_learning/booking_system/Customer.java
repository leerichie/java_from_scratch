package org.example.linkedIn_learning.booking_system;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {

        Scheduler scheduler = new Scheduler();

//        scheduler.bookHaircut("Lee", "Tuesday");
//        scheduler.bookHaircut("Ania", "Wednesday");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter hairdresser's name and day of appointment");
        scheduler.bookHaircut(input.next(), input.next());

        System.out.println("Thread count: " + Thread.activeCount());


    }
}
