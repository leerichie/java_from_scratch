package org.example.apps.battleships;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();

    }
}
