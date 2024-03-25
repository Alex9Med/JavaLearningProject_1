package com.MAG.bookcollectiontask;

public class Book {
    private String title;
    private String author;

    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void printTheBookDetails(){
        System.out.println("The book title is: " + title + "," + " written by " + getAuthor());
    }
}
