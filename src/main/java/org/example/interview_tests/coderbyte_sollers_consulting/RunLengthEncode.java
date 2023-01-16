package org.example.interview_tests.coderbyte_sollers_consulting;

import java.util.Scanner;

public class RunLengthEncode {

    public static String Rle (String input){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char currentChar = input.charAt(0);
        for (int i =0; i < input.length(); i++){
            if (input.charAt(i) == currentChar){
                count++;
            } else {
                sb.append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }
        sb.append(currentChar);
        sb.append(count);
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word to encode:");
        System.out.println("result: " + Rle(s.nextLine()));
    }
}
