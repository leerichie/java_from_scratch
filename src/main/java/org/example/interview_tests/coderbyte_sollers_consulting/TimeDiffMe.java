package org.example.interview_tests.coderbyte_sollers_consulting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TimeDiffMe {
    public static void periodOfTimeDifference() {
        Scanner input = new Scanner(System.in);

        // time
//        System.out.println("Enter time from (HH:mm):");
//        LocalTime timeFrom = LocalTime.parse(input.nextLine());
//        System.out.println("Enter time until (HH:mm)");
//        LocalTime timeUntil = LocalTime.parse(input.nextLine());
//
//        long timeDifference = Duration.between(timeFrom, timeUntil).toMinutes();
//        System.out.println("The time difference between the 2 times is: " + timeDifference + " mins");

        // days
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

        System.out.println("Enter day 1 (dd-mm-yyyy): ");
        LocalDate dateFrom = LocalDate.parse(input.nextLine());
        System.out.println("Enter day 2 (dd-mm-yyyy): ");
        LocalDate dateUntil = LocalDate.parse(input.nextLine());

        long dayDifference = Period.between(dateFrom, dateUntil).getDays();
        System.out.println("The day difference between the 2 days is: " + dayDifference + " days");

    }

    public static void main(String[] args) {
        periodOfTimeDifference();
    }
}
