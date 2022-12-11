package org.example.conclusion;

import java.util.Scanner;

public class Pesel {
    public static void main(String[] args) throws Exception {
        peselCheck();

    }
    public static boolean validDate(String peselNum){
        if (!(peselNum.charAt(2) <= 1 || !(peselNum.charAt(3) <= 9))) {
            System.out.println("Months format 01-12 - YY(MM)DDXXXXX");
        } else if (!(peselNum.charAt(4) <= 3) || !(peselNum.charAt(5) <= 9)) {
            System.out.println("Days format 01-31 - YYMM(DD)XXXXX");
        }
        return validDate(peselNum);
    }

    public static String peselCheck() throws Exception {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;

        final long peselLength = 11;

        Scanner input = new Scanner(System.in);
        for (int ii = 0; ii < 10; ii++) {
            System.out.println("Enter PESEL:");
            String num = input.nextLine();

            // YY MM DD XXXX K
            if (!num.matches("\\d+")) {
                System.out.println("Must contain 11 digits and NO letters");
            } else if (num.length() > 11) {
                System.out.println("PESEL too long");
            } else if (num.length() < 11) {
                System.out.println("PESEL too short");
            } else if (!(num.charAt(2) <= 1 || !(num.charAt(3) <= 9))) {
                System.out.println("Months format 01-12 - YY(MM)DDXXXXX");
            } else if (!(num.charAt(4) <= 3) || !(num.charAt(5) <= 9)) {
                System.out.println("Days format 01-31 - YYMM(DD)XXXXX");
            } else {
                System.out.println("Correct PESEL");
            }
        }
        throw new Exception();
    }
}