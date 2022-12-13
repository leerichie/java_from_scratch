package org.example.conclusion;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BasicTasks {

    private static boolean isSunday(int i, int firstWeekDayIndex) {
        return (i + firstWeekDayIndex) % 7 == 0;
    }

    public static void main(String[] args) {

        byte b = 100; // 8bit
        byte bCast = (byte) 10000000; // 8bit
        short s = 2022;
        int ia = 1234567890;
        float f = 1.123456789f;
        double d = 123456789.123456789d;
        boolean thisIsATrueBoolean = true;
        char c = 'c';
        String text = "some String text";
        System.out.println(b + " " + "\n" +
                bCast + " " + "\n" +
                s + "\n" +
                ia + "\n" +
                f + "\n" +
                d + "\n" +
                thisIsATrueBoolean + "\n" +
                text + "\n" +
                c);

        System.out.println();

//        Byte myByte = new Byte(b);
//        System.out.println(myByte);

        System.out.println();
        String strInt = "100";
        String strDouble = "500.5";
        String strFloat = "33.33";
        System.out.println(strInt + strDouble + strFloat);

        int toParseFromStrInt = Integer.parseInt(strInt);
        System.out.println(toParseFromStrInt / 10);

        double toParseFromStrDouble = Double.parseDouble(strDouble);
        System.out.println(toParseFromStrDouble - 0.5);

        float toParseFromStrFloat = Float.parseFloat(strFloat);
        System.out.println(toParseFromStrFloat + 13.33);

        char horizontal = '-';
        char vertical = '|';
        System.out.println(horizontal + "" + vertical);
        System.out.println(LocalDate.now().plusMonths(1).lengthOfMonth());

        Format formatDate = new SimpleDateFormat("E dd MMMMMM yyyy"); // E-day
        String dateToUk = formatDate.format(new Date());
        System.out.println(dateToUk);

        System.out.println(Math.max(5, 10));
        System.out.println(Math.PI);
        System.out.println(Math.abs(-101.5));

        byte doubleByte = 56;
        Byte doubleByteWrapper = doubleByte;
        System.out.println(doubleByteWrapper.byteValue());
        String s1 = doubleByteWrapper.toString();
        System.out.println(s1.length());

        final double radius = 7.5;
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

// dice roll - even or odd
        int result = (int) (Math.random() * 6 + 1);
        System.out.println("You rolled a: " + result);

        System.out.println("IF conditional dice");
        if (result == 6) {
            System.out.println("You rolled: " + result + " - You WIN");
        } else if (result % 2 == 0) {
            System.out.println(result + ": even ");
        } else {
            System.out.println(result + ": odd");
        }

        System.out.println("SWITCH conditional dice");
        switch (result) {
            case 1, 3, 5:
                System.out.println(result + ": odd");
                break;
            case 2, 4:
                System.out.println(result + ": even");
                break;
            case 6:
                System.out.println(result + ": You WIN");
        }

        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        int hours = lt.getHour();
        if (hours >= 12) {
            System.out.println("afternoon");
        } else {
            System.out.println("morning");
        }

        LocalDate ld = LocalDate.now();
        DayOfWeek day = ld.getDayOfWeek();
        System.out.println(ld);
        switch (day) {
            case MONDAY:
                System.out.println("1");
                break;
            case TUESDAY:
                System.out.println("2");
                break;
            case WEDNESDAY:
                System.out.println("3");
                break;
            case THURSDAY:
                System.out.println("4");
            case FRIDAY:
                break;
            case SATURDAY:
                System.out.println("6");
            default:
                System.out.println("No time to enter other days...");
        }

        // Loops

        int count = 0;
        for (int ii = -20; ii <= 20; ii++) {
            if (ii >= 4) {
                count++;
            }
            System.out.println(ii + "| Sum: " + count);
        }

        System.out.println();

        // Date & Time display characters
        LocalTime localTime = LocalTime.now();

        for (int ij = 1; ij <= localTime.getHour(); ij++) {
            if (ij == 1) {
                System.out.print("Current HOUR of day: " + localTime.getHour() + " --> ");
            }
            System.out.print("*" + " ");
        }
        System.out.println();

        for (int ij = 1; ij <= localTime.getMinute(); ij++) {
            if (ij == 1) {
                System.out.print("Current MINUTE of day: " + localTime.getMinute() + " --> ");
            }
            System.out.print("-" + " ");
        }
        System.out.println();

        for (int ij = 1; ij <= localTime.getSecond(); ij++) {
            if (ij == 1) {
                System.out.print("Current SECOND of day: " + localTime.getSecond() + " --> ");
            }
            System.out.print("/" + " ");
        }

        System.out.println("\n");

        // display calendar & day

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of week - number: " + dayOfWeek);
        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
        System.out.println("Day of week - name: " + dayWeekText);

        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeek1 = localDate.getDayOfWeek();
        System.out.println(dayOfWeek1);

        System.out.println();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter no of month: ");
//        int numMonth = scanner.nextInt();
//        System.out.println("Enter year: ");
//        int numYear = scanner.nextInt();
//        System.out.println("Enter current day no: ");
//        int currentDay = scanner.nextInt();
//
//        String[] dayName = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
//        for (String sDay : dayName) {
//            System.out.print("  " + sDay);  // print days line
//        }
//        System.out.println(); // next line after days
//
//        YearMonth yearMonth = YearMonth.of(numYear, numMonth);
//        int daysInMonth = yearMonth.lengthOfMonth();
//        DayOfWeek dayOfWeek2 = yearMonth.atDay(1).getDayOfWeek(); // set first day of month
//
//        int startIndex = dayOfWeek2.getValue();
//
//        for (int i = 0; i < startIndex; i++) {
//            System.out.print("     ");
//        }
//
//        for (int i = 0; i < daysInMonth; i++) {
//            if (isSunday(i, startIndex)) {
//                System.out.println();
//            }
//            if(currentDay -1 == i && currentDay < 10) {
//                System.out.format("  [%1d]", i +1);
//            } else if (currentDay -1 == i && currentDay > 9) {
//                System.out.format(" [%2d]", i +1); //print number of day in brackets
//            } else {
//                System.out.format("%5d", i +1); //print number of day
//            }
//        }

        System.out.println("\n");

        //  Arrays

        int[] integers10 = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};
        int sumUp = 0;
        int numList = 0;
        int smallest = integers10[0];
        int biggest = integers10[0];
        for (int i : integers10) {
            if (i > biggest) {
                biggest = i;
            } else {
                smallest = i;
            }
        }
        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);

        System.out.println();

        int[] money = {1, 2, 5, 10, 20};
        int idx = (int) (Math.random() * money.length + 1);
        int sum = 0;
        while (sum <= 100) {
            System.out.println(idx = (int) (Math.random() * money.length + 1));
            System.out.println(sum += idx);
            System.out.println("Equation: " + count++ + " " + idx + " : " + sum);
            if (sum > 100){
                break;
            }
        }
        System.out.println("\nGot 100: " + sum);

        System.out.println();


    }
}