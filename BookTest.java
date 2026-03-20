package com.mycompany.lms;

public class BookTest {

    public static void main(String[] args) {

        System.out.println("=== Book Test ===");

        // Create a Book instance
        // title, available, itemId, author, isbn

        Book book = new Book("Java Programming", true, 1, "J. Smith", "12345");

        // Print initial state
        System.out.println("Initial Book: " + book);

        // Borrow the book
        System.out.println("\nBorrowing the book...");

        if (book.isAvailable()) {

            // Set book availability to false
            book.setAvailable(false);

            System.out.println("Book borrowed successfully.");

        } else {

            System.out.println("Book is not available to borrow.");

        }

        // Attempt to borrow again
        System.out.println("\nAttempting to borrow again...");

        // Check if book is not available
        if (!book.isAvailable()) {

            System.out.println("Book is already on loan.");

        }

        // Return the book
        System.out.println("\nReturning the book...");

        // Set book availability to true
        book.setAvailable(true);

        System.out.println("Book returned successfully.");
        // Final state

        System.out.println("\nFinal Book: " + book);

    }

}
        
