package com.mycompany.lms;
 
// Book.java
//It extends the LibraryItems, iclues title, item id and shows availability 
public class Book extends LibraryItem {
    //Variable to store the author of the book
    private String author;
    //Variable to store the ISBN number of the book
    private String isbn;
    Book
 
    public Book(String title, boolean available, int itemId, String author, String isbn) {
        super(title, available, itemId);
        // Constructor implementation
    }   //This is used to create a new book object.
    //Parameters
    //Title of the book 
    //Show if the book is available or not 
    //Unique Id for a book 
    //Author of the book 
    //The IBSN number of the Book
 
    public Book(String title, boolean available, int itemId, String author, String isbn) {
        //Calls the constructor of the LibraryItem
        super(title, available, itemId);
        //Give value to the to the book specific characters
        this.author = author;
        this.isbn = isbn;
    }
    //Getter method for the author 
    //Returns the author of the book
    public String getAuthor() {
        // Getter implementation
        return author ;
    }
 
    //Setter methods for the author 
    //allows to update the author of the book
    public void setAuthor(String author) {
        this.author = author;
    }
//Getter methods for ISBN
    //RETURNS THE ISBN number of the book
    public String getIsbn() {
        this.isbn = isbn;
        return null;
    }
    //toString method
    //this method returns a string representation of the  book object
    //including its details
    @Override
    public String toString() {
        // toString implementation
        return "Book{" +
               "title='" + getTitle() + '\'' +
               ", available=" + isAvailable() +
               ", itemId=" + getItemId() +
               ", author='" + author + '\'' +
               ", isbn='" + isbn + '\'' +
               '}';
    }
}
