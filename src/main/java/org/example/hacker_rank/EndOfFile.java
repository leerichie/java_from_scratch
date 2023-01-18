package org.example.hacker_rank;

import java.io.File;
import java.util.Scanner;

public class EndOfFile {
    static File directory = new File("src/main/java/org/example/files_directory");
    static Scanner input = new Scanner(System.in);
    static int ch;
    static boolean done = true;

    public static void main(String[] args) {

        mainMenu();
    }

    private static void mainMenu() {
//        Scanner input = new Scanner(System.in);

        System.out.println("""
                    * File Menu *\s
                 1. Create\s
                 2. Delete\s
                 3. Update\s
                 4. Show files\s
                 5. Find in file\s

                 Choose an option or press 0 to exit
                """);
        ch = input.nextInt();
        do {
            if (ch == 1) {
                createFile();
            } else if (ch == 2) {
                deleteFile();
//                System.out.println("TODO - delete");
            } else if (ch == 3) {
//                updateFile();
                System.out.println("TODO - edit");
            } else if (ch == 4) {
//                showFiles();
                System.out.println("TODO - show");
            } else if (ch == 5) {
//                findInFile();
                System.out.println("TODO - find in file");
            } else {
                System.out.println("Invalid choice - try again!");
                mainMenu();
            }
            ch = input.nextInt();
        }
        while (ch != 0);
    }

    private static void returnToMenu() {
//        Scanner input = new Scanner(System.in);
        System.out.println("Press 0 to return to Main Menu");
        int ch = input.nextInt();
        if (ch == 0) {
            mainMenu();
        } else {
            System.out.println("Invalid choice - try again!");
            returnToMenu();
        }
    }

    private static void createFile() {
//        Scanner input = new Scanner(System.in);
        System.out.println("* Create File *\n" +
                "Enter file name and format:");
        try {
            directory = new File(input.next());

            if (directory.createNewFile()) {
                System.out.println(directory.getPath() + " - successfully created!\n");
            } else {
                System.out.println(directory.getPath() + " - file with that name already exists!!\n");
            }
        } catch (Exception e) {
            System.out.println("An error occurred trying to create file");
        }
        returnToMenu();
    }

    private static void deleteFile() {
        System.out.println(" * Delete * \n" +
                "Files in Directory: " + directory);
        File[] files = directory.listFiles();
        int count = 1;
        assert files != null;
        for (File file : files) {
            System.out.println(count++ + ". " + file.getName());
        }
        System.out.println("\nEnter name of file to delete:");
        String fileName = input.next();
        for (File file : files) {
            if (file.getName().equals(fileName)) {
                file.delete();
            }
        }
        mainMenu();

//                System.out.println("Are you sure you want to delete the file (Y/N)?");
//                String confirm = input.nextLine();
//                if (!confirm.equals("Y")) {
//                    System.out.println("Deletion Aborted.");
//                    mainMenu(
//                } else {
//                    file.delete();
//                    System.out.println(fileName + " has been deleted.");

//                    try {
//                        TimeUnit.SECONDS.sleep(5);
//                        mainMenu();
//                    } catch (InterruptedException ie) {
//                        Thread.currentThread().interrupt();
//                    }
    }
}