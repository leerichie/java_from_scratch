package org.example.linkedIn_learning.input_output;

import java.io.*;

public class BuffReadExample {
    public static void main(String[] args) throws IOException {


        File file = new File("example.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
        }

    }
}