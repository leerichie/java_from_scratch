package org.example.linkedIn_learning.input_output;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {

        File myFile = new File("/Users/ashmacair/Desktop/File_write_test.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException("Not working leeeeee" + e.getMessage());
        }

    }
}
