package org.example.linkedIn_learning.input_output;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClass {
    public static void main(String[] args) {

        Path filePath = Paths.get("/Users/ashmacair/Desktop/MyDir1");   // remove file

        try {       // try-catch needed in case FILE / DIR not found
            Files.deleteIfExists(filePath);
        } catch (IOException ioe) {

        }


        String[] contents = new File("/Users/ashmacair/Desktop").list();    // display files after delete

        if (contents != null) {     // check if exists
            for (String listFiles : contents) {
                System.out.println(listFiles);
            }
        }
    }
}
