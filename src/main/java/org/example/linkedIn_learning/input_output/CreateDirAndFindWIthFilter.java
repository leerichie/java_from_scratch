package org.example.linkedIn_learning.input_output;

import java.io.File;
import java.io.FilenameFilter;

public class CreateDirAndFindWIthFilter {
    public static void main(String[] args) {

        FilenameFilter filter = (sFile, fileName) -> fileName.contains("down");     // find in file name


        String[] contents = new File("/Users/ashmacair/Desktop").list(filter);  // show files (& filter)

        if (contents != null) {     // check existence of
            for (String sFile : contents) {
                System.out.println(sFile);
            }
            new File("/Users/ashmacair/Desktop/MyDir1").mkdir();    // create dir at path
        }
    }
}