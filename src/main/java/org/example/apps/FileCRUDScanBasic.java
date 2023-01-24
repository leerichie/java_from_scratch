package org.example.apps;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FileCRUDScanBasic {
    static File directory = new File("src/main/java/org/example/files_directory/");
    static File[] files;
    static Scanner input = new Scanner(System.in);
    static int ch;

    public static void main(String[] args) throws IOException {

        mainMenu();
    }

    private static void mainMenu() throws IOException {
        System.out.println("""
                 * File Menu *\s
                1. Create\s
                2. Delete\s
                3. Rename\s
                4. Show files\s
                5. Read File\s

                Choose an option or press 0 to exit""");
        ch = input.nextInt();
        do {
            if (ch == 1) {
                System.out.println();
                createFile();
            } else if (ch == 2) {
                System.out.println();
                deleteFile();
            } else if (ch == 3) {
                System.out.println();
                updateFile();
            } else if (ch == 4) {
                System.out.println();
                showFiles();
            } else if (ch == 5) {
                System.out.println();
                readFile();
                System.out.println("TODO - find in file");
            } else {
                System.out.println("Invalid choice - try again!");
                mainMenu();
            }
            ch = input.nextInt();
        }
        while (ch != 0);
    }

    private static void returnToMenu() throws IOException {
        System.out.println("Press 0 to return to Main Menu");
        ch = input.nextInt();
        if (ch != 0) {
            System.out.println("Invalid choice - try again!");
            returnToMenu();
        }
        mainMenu();
    }

    private static void createFile() throws IOException {
        System.out.println("* Create File *\n" +
                "Current Directory: " + "src/main/java/org/example/files_directory/" + "\n" +
                "Enter file name and format:");
        String createFileName = input.next();
        try {
            directory = new File("src/main/java/org/example/files_directory/", createFileName);
            while (createFileName.length() < 4 || createFileName.length() > 10
                    || !createFileName.contains(".") || createFileName.contains(" ")) {
                System.out.println("-> 4-10 chars\n" + "-> NO spaces\n" + "-> file format (eg .txt)");
                createFileName = input.next();
            }
            if (directory.createNewFile()) {
                System.out.println(directory.getPath() + " - successfully created!\n");
            } else {
                System.out.println(directory.getPath() + " - file with that name already exists!!\n");
            }


        } catch (
                Exception e) {
            System.out.println("An error occurred trying to create file");
        }

        returnToMenu();

    }

    private static void deleteFile() throws IOException {
        System.out.println(" * Delete * \n" +
                "Files in Directory: " + "src/main/java/org/example/files_directory/");
        files = directory.listFiles();
        int count = 1;
        assert files != null;
        for (File file : files) {
            System.out.println(count++ + ". " + file.getName());
        }
        System.out.println("\nEnter name of file to delete:");
        String fileNameDelete = input.next();
        for (File file : files) {
            if (file.getName().equals(fileNameDelete)) {
                System.out.println("Are you sure you want to delete the file (Y/N)?");
                String confirm = input.next();
                switch (confirm.toUpperCase()) {
                    case "Y" -> {
                        file.delete();
                        System.out.println(fileNameDelete + " has been deleted.");
                    }
                    case "N" -> {
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException ie) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("Deletion Aborted.");
                    }
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        returnToMenu();
    }

    private static void updateFile() throws IOException {
        System.out.println(" * Update * \n" +
                "Files in Directory: " + directory);
        files = directory.listFiles();
        int count = 1;
        assert files != null;
        for (File file : files) {
            System.out.println(count++ + ". " + file.getName());
        }
        System.out.println("\nEnter name of file to rename:");
        String existingFileName = input.next();
        for (File file : files) {
            if (file.getName().equals(existingFileName)) {
                System.out.println("Enter new name:");
                String newFileName = input.next();
//                newFileName = existingFileName;
                System.out.println("Are you sure you want to rename the file (Y/N)?\n" +
                        "Current: " + existingFileName + "\n" +
                        "New: " + newFileName);
                String confirm = input.next();
                switch (confirm.toUpperCase()) {
                    case "Y" -> {
                        file.renameTo(new File("src/main/java/org/example/files_directory/", newFileName));
                        System.out.println(existingFileName + " has been renamed to " + newFileName + "\n");
                    }
                    case "N" -> {
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException ie) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("Rename Aborted.");
                    }
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        returnToMenu();
    }

    private static void showFiles() throws IOException {
        System.out.println(" * All Files * \n" +
                "Files in Directory: " + directory);
        files = directory.listFiles();
        int count = 1;
        assert files != null;
        for (File file : files) {
            System.out.println(count++ + ". " + file.getName());
        }
        returnToMenu();
    }

    private static void readFile() throws IOException {
        System.out.println(" * Read Files * \n" +
                "Files in Directory: " + directory);
        files = directory.listFiles();
        int count = 1;
        assert files != null;
        for (File file : files) {
            System.out.println(count++ + ". " + file.getName());
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/org/example/files_directory/DO_NOT_DELETE.txt"));
            System.out.println("Choose file...");
            String str;

            while ((str = br.readLine()) != null) {
                System.out.println("RESULTTTTT:::: " + str);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error!");
        }

        returnToMenu();
    }
}