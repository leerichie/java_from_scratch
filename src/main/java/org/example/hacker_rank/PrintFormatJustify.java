package org.example.hacker_rank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrintFormatJustify {
    private static void solution() throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);

        System.out.println("==========================================");

        for (int i=0; i < 3; i++){
//            String s = br.readLine();
//            int in = Integer.parseInt(br.readLine());
            String s = input.next();
            int in = input.nextInt();
            System.out.printf("%-15s%03d\n", s, in);
        }

        System.out.println("==========================================");

    }

    public static void main(String[] args) throws IOException {

        solution();
    }
}