package org.example.head_first_java_3rd.ch2_classes_and_objects;

import java.util.Scanner;

public class Game {
    public String player;
    public int guessedNo;
    public boolean isRight = false;
    public int targetNr = (int) (Math.random() * 5);

    Scanner input = new Scanner(System.in);

    void playGame() {
        System.out.println("** Number Guessing Game **");
        System.out.println("Enter player name:");
        player = input.next();

        System.out.println("Enter a number:");

        while (true) {
            guessedNo = input.nextInt();
            if (guessedNo != targetNr) {
                winner();
            } else {
                winner();
                break;
            }
        }
    }

    void winner (){
        if (targetNr == guessedNo) {
            isRight = true;
            System.out.println("You win!" + " Your guess: " + guessedNo + ", Target: " + targetNr);
        } else {
            System.out.println("Wrong - Try again!" + " Your guess: " + guessedNo + ", Target: " + targetNr);
        }
    }
}
