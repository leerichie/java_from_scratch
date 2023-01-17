package org.example.loopyloops;

import java.util.Arrays;
import java.util.Scanner;

public class LetterLoopInputToFormString {
    public static String stringSingleInputJoinLetters() {

        StringBuilder sb = new StringBuilder();
        Scanner input = new Scanner(System.in);

        // set array of ordinals for loop
        String[] ordinals = {"First -> ", "Second -> ", "Third -> ", "Fourth -> ",
                "Fifth -> ", "Sixth -> ", "Seventh -> ", "Eighth -> ", "Ninth -> ",
                "Tenth -> ", "Eleventh -> ", "Twelfth -> "};

        // set array size - letter input
        System.out.println("Enter size of array:");
        int arraySize = input.nextInt();

        System.out.println("Enter your " + arraySize + " characters:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(ordinals[i]);
            sb.append(input.next().toUpperCase());
        }

        System.out.println("Result: " + sb.substring(1, 3));
        return sb.toString();
    }

    public static String joinChars() {

        char[] letters = {'W', 'o', 'n', 'd', 'e', 'r'};

        String name = new String(letters);
        System.out.print("Array of chars: ");
        for (char c : letters) {
            System.out.print("'" + c + "' ");
        }
        System.out.println();
//        System.out.println("Array of chars: " + "'" +
//                letters[0] + "'" + letters[1] + "'" +
//                letters[2] + "'" + letters[3] + "'" + letters[4] + "'" + letters[5] + "'");
        System.out.println("Joined chars: " + name);
        return name;
    }

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println(joinChars(input.nextLine()));
//        joinChars();

        stringSingleInputJoinLetters();
    }
}
