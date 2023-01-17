package org.example.interview_tests.coderbyte_sollers_consulting;

import java.util.Scanner;

public class RunLengthEncode {
    public static String Rle (String input){

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++){
            while (i < input.length() -1 && input.charAt(i) == input.charAt(i +1)) {
                count++;
                i++;
            }
            sb.append(input.charAt(i));
            sb.append(count);
        }
        return "Result: ".concat(sb.toString());
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word to encode:");
        System.out.println(Rle(s.nextLine()));
    }
}
