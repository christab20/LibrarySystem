package com.mycompany.lms;
public class BookTest {

// Book.java
// It extends LibraryItem, includes title, item id and shows availability
public class Book extends LibraryItem {

    // Variable to store the author of the book
    private String author;

    // Variable to store the ISBN number of the book
    private String isbn;

    // Constructor to create a Book object
    //Parameters:
    //title - the name of the book
    // availiable - indicates if the book is currently available (true/false)
    // itemId - unique identifier for the book
    //author - name of the author
    //isbn - ISBN number of the book
    public Book(String title, boolean available, int itemId, String author, String isbn) {
        //Calls the constructor of the parent class (LibraryItem)
        super(title, available, itemId);

        //Assign values to Book - specific attributes 
        this.author = author;
        this.isbn = isbn;
    }
 
    // Getter method for the author
    //Returns the name of the autor
    public String getAuthor() {
        return author;
    }

    // Setter method for the author
    //Allows updating the author's name 
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for ISBN
    //Returns the ISBN number of the book
    public String getIsbn() {
        return isbn;
    }

    // Setter method for ISBN 
    //Allows uodating the ISBN number
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // toString method
    //Returns a string representation of the Book object
    //Includes a;ll important details of the book
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
}

