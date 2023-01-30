package org.example;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracticeClass {

    static class Output {
        void go() {
            int value = 7;
            for (int i = 1; i < 8; i++) {
                value++;
                if (i > 4) {
                    System.out.print(++value + " ");
                }
                if (value > 14) {
                    System.out.println(" i = " + i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int lineNumber = 0;
        System.out.println("Type sth:");

        while (scan.hasNextLine()) {
            lineNumber++;
            String line = scan.nextLine();
            System.out.println(lineNumber + " " + line);
        }
//        double x = 2.22;
//        int y = (byte) x;
//
//        System.out.println(x);
//        System.out.println("Casting result: " + y);
        }
    }
