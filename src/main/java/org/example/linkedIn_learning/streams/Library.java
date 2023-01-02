package org.example.linkedIn_learning.streams;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Books> myBooks = populateLibrary();
        myBooks.stream()        // OPTION - parallelStreams()
                .filter(books -> books.getTitle().contains("e"))
                .filter(books -> books.isHardback).forEach(System.out::println);


    }

    static ArrayList<Books> populateLibrary() {
        ArrayList<Books> myBooks = new ArrayList<>();
        myBooks.add(new Books("Head First", "O'Reilly", 2022, false));
        myBooks.add(new Books("My First Java Job", "Leeski", 2023, false));
        myBooks.add(new Books("Be the best at Java", "Leeski", 2023, true));
        myBooks.add(new Books("Never stop with Java", "Lee R", 2020, true));
        myBooks.add(new Books("Keep learning Java", "Lee R", 2023, false));
        myBooks.add(new Books("My Java Mission", "Ash R", 2022, true));
        return myBooks;
    }
}
