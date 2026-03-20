package com.mycompany.lms;

// StudentMember.java
//This class represents a student member of the library
// It extends the Member class and adds a borrowing limit specific to students

public class StudentMember extends Member {

    // Variable to store the maximum number of books a student can borrow
    private int maxBooks = 5;

    // Constructor to create a StudentMember object
    // Parameters:
    // memberId - unique ID of the member
    // name - name of the member
    // email - email of the member
    // borrowedBooks - number of books currently borrowed
    
    public StudentMember(int memberId, String name, String email, int borrowedBooks) {
        // Calls the constructor the parent class (Member)
        super(memberId, name, email, borrowedBooks);
    }

    //Getter method for maxBooks
    //Returns the maximum number of books a student can borrow 
    @Override
    public int getMaxBooks() {
        return maxBooks;
    }

    //Setter method for maxBooks 
    //Allows updating the borrowing limit for the student 
    public void setMaxBooks(int maxBooks) {
        this.maxBooks = maxBooks;
    }
    
    //Method to increment the number of borrowed books 
    //Checks if the student has reached the borrowing limit before allowing increment  
      @Override
    public void incrementBorrowedBooks() {
        if (getBorrowedBooks() < maxBooks) {
            //Calls parent method to increase borrowedBooks 
            super.incrementBorrowedBooks();
        } else {
            //Display message if limit is reached
            System.out.println("Cannot borrow more books! Limit reached.");
        }
    }
      
    //Method to decrement the number of borrowed books 
    //Ensures the number does not go below zero 
      @Override
    public void decrementBorrowedBooks() {
        if (getBorrowedBooks() > 0) {
            // Call parent method to decrease borrowedBooks 
            super.decrementBorrowedBooks();
        }
    }

   
    
    

    @Override
    public String toString() {
//        return "StudentMember{" +
//                "memberId=" + getMemberId() +
//                ", name='" + getName() + '\'' +
//                ", email='" + getEmail() + '\'' +
//                ", borrowedBooks=" + getBorrowedBooks() +
//                ", maxBooks=" + maxBooks +
//                '}';

         return "StudentMember" + super.toString() + "Max Books; " +maxBooks;

    }
}


