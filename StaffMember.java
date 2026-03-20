package com.mycompany.lms;
// StaffMember.java
//This class represents a staff member in the library system 
// It extends the Member class and defines a higher borrowing limit

public class StaffMember extends Member {
    // Maximum number of books a staff member can borrow
    private int maxBooks = 10;

    // Constructor to create a StaffMember object
    // memberId - unique ID of the member
    // name - name of the member
    // email - email address of the member
    // borrowedBooks - number of books currently borrowed
    public StaffMember(int memberId, String name, String email, int borrowedBooks) {
        // Call parent class constructor
        super(memberId, name, email, borrowedBooks);
    }

    // Getter method for maxBooks
    // Returns the maximum borrowing limit for staff
    @Override
    public int getMaxBooks() {
        return maxBooks;
    }

    // Setter method for maxBooks
    // Allows updating the borrowing limit
    public void setMaxBooks(int maxBooks) {
        this.maxBooks = maxBooks;
    }

     // Method to increment the number of borrowed books
    // Ensures staff does not exceed their borrowing limit
     @Override
    public void incrementBorrowedBooks() {
        if (getBorrowedBooks() < maxBooks) {
            // Call parent method to increase borrowedBooks
            super.incrementBorrowedBooks();
        } else {
            // Display message if limit is reached
            System.out.println("Cannot borrow more books! Limit reached.");
        }
    }
    // Method to decrement the number of borrowed books
    // Ensures the count does not go below zero
    @Override
    public void decrementBorrowedBooks() {
        if (getBorrowedBooks() > 0) {
             // Call parent method to decrease borrowedBooks
            super.decrementBorrowedBooks();
        }
    }
    // toString method
    // Returns a string representation of the StaffMember object
    // Includes all relevant member details and borrowing limit
    @Override
    public String toString() {
        return "StaffMember{" +
                "memberId=" + getMemberId() +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", borrowedBooks=" + getBorrowedBooks() +
                ", maxBooks=" + maxBooks +
                '}';
    }
}
