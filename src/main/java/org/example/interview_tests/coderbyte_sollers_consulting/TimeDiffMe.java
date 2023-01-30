package org.example.interview_tests.coderbyte_sollers_consulting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TimeDiffMe {
    public static void periodOfTimeDifference() throws ParseException {
        Scanner input = new Scanner(System.in);

        LocalTime lt = LocalTime.now()
                .plusHours(2)
                .withSecond(0)
                .withNano(0);
        System.out.println(lt);


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
        String from = input.next();
        LocalDate date1 = LocalDate.parse(from, DateTimeFormatter.ofPattern(df.toPattern()));

        System.out.println("Enter day 2 (dd-mm-yyyy): ");
        String to = input.next();
        LocalDate date2 = LocalDate.parse(to, DateTimeFormatter.ofPattern(df.toPattern()));

        String dayDifference = String.valueOf(Period.between(date1, date2).getDays());
        String monthDifference = String.valueOf(Period.between(date1, date2).getMonths());
        String yearDifference = String.valueOf(Period.between(date1, date2).getYears());
        System.out.println("Difference: " + dayDifference + " days");
        System.out.println("Difference: " + monthDifference + " months");
        System.out.println("Difference: " + yearDifference + " years");

    }

    public static void main(String[] args) throws ParseException {
        periodOfTimeDifference();
    }
}
