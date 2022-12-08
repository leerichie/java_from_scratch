package org.example.conclusion;

import java.util.Scanner;

public class Reducer {
    public static void main(String[] args) {

        reduce();
    }

    public static String reduce() {
        String number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        number = input.nextLine();

        while (number.length() > 1) {
            int result = 1;
            System.out.print(number + " => ");
            for (int i = 0; i < number.length(); i++) {
                int currentNumber = Character.getNumericValue(number.charAt(i));
                result *= currentNumber;
                System.out.print(currentNumber);
                if (i != number.length() - 1) {
                    System.out.print("x");
                }
            }
            number = String.valueOf(result);
            System.out.println(" => " + number);
        }

        return number;
    }
}