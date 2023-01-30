package org.example.sda_materials.regex;

import java.io.StringReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    static void compiler(){
//        "org/example/files_directory/DO_NOT_DELETE.txt"

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:");
        String s1 = input.nextLine();
//        String s2 = input.nextLine();
        String toMatch = "\\s";

//        Pattern p = Pattern.compile(s1);
//        Matcher m = p.matcher(".*,.*");

        if (s1.matches(toMatch)){
            System.out.println("Match found: " + s1);
        } else {
            System.out.println("Not found");
        }
    }
}
