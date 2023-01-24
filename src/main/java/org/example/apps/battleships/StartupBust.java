package org.example.apps.battleships;

import java.util.ArrayList;
import java.util.Scanner;

public class StartupBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuesses;
//    public Scanner input = new Scanner(System.in);

    void setUpGame(){
        Startup one = new Startup();
        System.out.print("Enter ship name 1: ");
        one.setName("HMS Rodney");
        Startup two = new Startup();
        System.out.print("Enter ship name 2: ");
        two.setName("Fair Lady");
        Startup three = new Startup();
        System.out.print("Enter ship name 3: ");
        three.setName("Doobie-Do");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Your goal is to sink three ships");
        System.out.println("HMS Rodney, Fair Lady, Doobie-Do");
        System.out.println("Try to sink them all in the fewest guesses!");

        for (Startup startup : startups){
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }
    void startPlaying(){
        while (!startups.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";
        for (Startup startupToTest : startups){
            result = startupToTest.checkYourself(userGuess);

            if(result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
                startups.remove(startupToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){
        System.out.println("All startups are dead! Yoru stock is now worthless");
        if(numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses!!");
            System.out.println("Fish are dancing with your options");
        }
    }

}
