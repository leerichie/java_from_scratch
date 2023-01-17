package org.example.hacker_rank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Scanner;

public class DataTypeFIt {
    public static void main(String[] argh) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = Long.parseLong(bf.readLine());
//                long x = sc.nextLong();
//                if (x > Long.MAX_VALUE || x < Long.MIN_VALUE) {
//                    System.out.println(x + " can't be fitted anywhere.");
//                } else {
                System.out.println(x + " can be fitted in:");

                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
//                System.out.println(sc.next() + " can't be fitted anywhere.");
                System.out.println(bf.readLine() + " can't be fitted anywhere.");
            }

        }
    }
}