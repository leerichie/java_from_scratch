package org.example.linkedIn_learning.abstraction;

import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws IOException {

        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader
                ("/message.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());


    }
}
