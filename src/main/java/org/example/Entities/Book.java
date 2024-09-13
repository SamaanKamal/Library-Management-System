package org.example.Entities;
import java.util.Date;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private Date publicationDate;
    private boolean isAvailable;

    public Book() {
    }

    public Book(String title, String author, String ISBN, Date publicationDate, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationDate = publicationDate;
        this.isAvailable = isAvailable;
    }
    public void updateBookDetails(String title, String author, Date publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book[Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Available: " + isAvailable + "]";
    }
}
