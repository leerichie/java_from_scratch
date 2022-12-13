package org.example;

public class PracticeClass {

    static void hourglass() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print("\\");
                } else if (i + j == 9) {
                    System.out.print("/");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Draw the middle part of the hourglass
        for (int i = 0; i < 10; i++) {
            System.out.println("          ");
        }

        // Draw the lower part of the hourglass
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print("/");
                } else if (i + j == 9) {
                    System.out.print("\\");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hourglass();

    }
}
