package org.example.conclusion;

import java.util.Scanner;

public class SMS {
    public static void main(String[] args) {

        message();

    }
    public static String message(){

        int amountChars = 0;
        double price = 0.25;
        int countSMS = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter msg:");
        String msg = input.nextLine();
//        if (msg.length() < 1 || msg.length() > 160){
//            System.out.println("- Max 160 characters");
//            message();
//        }
        for(int i=0; i<msg.length(); i++){
            amountChars++;
            if(i % 160 == 1){
                countSMS++;
            }
        }
        price *= countSMS;

        System.out.println(
                "Char count: " + amountChars + "\n"
                + "SMS count: "+ countSMS + "\n"
                + "Price: " + price);

        StringBuffer sb = new StringBuffer();
        String [] findSpaces = msg.split("\\s");
        for (String loopThrough : findSpaces){
            char firstChar = loopThrough.charAt(0);
            char firstToUpper = Character.toUpperCase(firstChar);
            String replaced = loopThrough.replaceFirst
                    (Character.toString(firstChar), Character.toString(firstToUpper));

            sb.append(replaced);
            sb.append(' ');
        }

        String afterChanges = sb.toString().trim().replace(" ", "");

        System.out.println("Your msg: " + "\n" + afterChanges + "\n" + "Msg sent!");

        return afterChanges;
    }
}
