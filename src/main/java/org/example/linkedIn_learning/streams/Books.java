package org.example.linkedIn_learning.streams;

public class Books {
    String title;
    String author;
    int yearOfPublication;
    boolean isHardback;

//    public String yesNo(boolean isHardback){
//        return isHardback ? "Yes" : "No";
//    }

    public Books (){
    }

    public Books (String title, String author, int yearOfPublication, boolean isHardback){
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.isHardback = isHardback;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isHardback() {
        return isHardback;
    }

    public void setHardback(boolean hardback) {
        isHardback = hardback;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", " +
                "Author: " + author + ", " +
                "Year of Publication: " + yearOfPublication + ", " +
                "Hardback: " + isHardback;

    }
}
