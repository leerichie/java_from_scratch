package org.example.sda_materials.input_output;

import java.io.*;

public class InAndOut {
    public static void main(String[] args) throws IOException {

        BufferedWriter write = new BufferedWriter(new FileWriter("path_p_output.txt"));
//        int numbered = 1;
        String[] name = {"Ash", "Julie", "Sam", "Chloe"};
        for (int i = 0; i < 10; i++) {
//            for(String names : name) {
            write.write((i + 1) + " " + name[i % name.length] + "\n");

        }
        write.close();

        BufferedReader read = new BufferedReader(new FileReader("path_p_output.txt"));
        char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String line;
        int numUp = 1;
        while ((line = read.readLine()) != null) {
            for (char ch : c) {
                System.out.println(line + " -> (" + numUp++ + "" + ch + ") ");
            }
        }


//        Path p = Paths.get("Path_p_output.txt");
////        Files.createFile(p);
////        Files.write(p, "This is the first line".getBytes(), StandardOpenOption.WRITE);
////        Files.write(p, "\nThis is the SECOND line".getBytes(), StandardOpenOption.APPEND);
//
//        for(String line : Files.readAllLines(p)){
//            if(!line.contains("f")) {
//                System.out.println(line);
//            }
//        }

//
//        FileReader in = new FileReader("Path_p_output.txt");
//        FileWriter out = new FileWriter("Path_p_output.txt");
//
//        int nextChar;
//        while ((nextChar = in.read()) != -1) {
//            out.append((char) nextChar);
//        }
//        System.out.println();
    }
}
