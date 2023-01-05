package org.example.linkedIn_learning.input_output;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class PathClassMethods {
    public static void main(String[] args) throws IOException {

        Path source = Paths.get("example.txt");     // get file
        Path dest = Paths.get("exampleCopiedContents.txt");     // make file
        Files.copy(source, dest, REPLACE_EXISTING);   // copy contents (wrap with try-catch IOException)
        // optional add 3rd arg - REPLACE_EXISTING - if FILE already exists

        Path filePath = Paths.get("/Users/ashmacair/Desktop/MyDir");   // locate file / dir
        System.out.println(filePath.getFileName());
        System.out.println(filePath.endsWith(".txt"));
        System.out.println(filePath.getParent());

        try {       // try-catch needed in case FILE / DIR not found
            Files.deleteIfExists(filePath); // delete above file
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
