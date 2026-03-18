package com.mycompany.lms;

// Book.java
// It extends LibraryItem, includes title, item id and shows availability
public class Book extends LibraryItem {

    // Variable to store the author of the book
    private String author;

    // Variable to store the ISBN number of the book
    private String isbn;

    // Constructor to create a Book object
    public Book(String title, boolean available, int itemId, String author, String isbn) {
        super(title, available, itemId);
        this.author = author;
        this.isbn = isbn;
    }

    // Getter method for the author
    public String getAuthor() {
        return author;
    }

    // Setter method for the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for ISBN
    public String getIsbn() {
        return isbn;
    }

    // Setter method for ISBN 
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // toString method
    @Override
    public String toString() {
        return "Book{" +
               "title='" + getTitle() + '\'' +
               ", available=" + isAvailable() +
               ", itemId=" + getItemId() +
               ", author='" + author + '\'' +
               ", isbn='" + isbn + '\'' +
               '}';
    }
}
