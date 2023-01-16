package org.example.interview_tests.coderbyte_sollers_consulting;

import java.io.IOError;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class TimeDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first time (HH:mm): ");
        LocalTime time1 = LocalTime.parse(scanner.nextLine());
        System.out.print("Enter second time (HH:mm): ");
        LocalTime time2 = LocalTime.parse(scanner.nextLine());
        long difference = Duration.between(time1, time2).toMinutes();
        System.out.println("Time difference: " + Math.abs(difference) + " minutes");
    }
}
