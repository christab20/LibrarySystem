package com.mycompany.lms;

// Member.java

//Base class representing a library member
public class Member {

    //Unique ID for the member
    private int memberId;
    //Name of the member
    private String name;
    //Email address of the member 
    private String email;
    //Number of books currently borrowed by the member
    private int borrowedBooks;

   //Constructor to initiaize all member fields
    // Parameters:
    // memberId - unique identifier for the member
    // name - name of the member
    // email - email address of the member
    // borrowedBooks - number of books currently borrowed
    public Member(int memberId, String name, String email, int borrowedBooks) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.borrowedBooks = borrowedBooks;
    }
    //Getter method for memberId
    //Returns the unique ID of the member
    public int getMemberId() {
        return memberId;
    }
    //Setter method for memberId
    //Allows updating the member ID
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    
    //Getter method for name 
    //Returns the name of the member
    public String getName() {
        return name;
    }
    
    //Setter method for me 
    //Allows updating the member's name 
    public void setName(String name) {
        this.name = name;
    }
    
    //Getter method for email
    //Returns the email address of the member 
    public String getEmail() {
        return email;
    }
    
    //Setter method for email
    //Allows updating the email address
    public void setEmail(String email) {
        this.email = email;
    }
    
    //Getter methods for borrowedBooks 
    //Returns the number of books currently borrowed 
    public int getBorrowedBooks() {
        return borrowedBooks;
    }
    
    //Setter method for borrowedBooks 
    //Allows updating the number of borrowed books 
    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    
    //Method to return the maximum number of books allowed 
    //Default is 0 for general members
    //This method is overridden in subclasses like StudentMember
    public int getMaxBooks() {
        return 0; // base class default (overridden in StudentMember or StaffMember)
    }
     // Method to increment the number of borrowed books
    // Called when a member borrows a book
 public void incrementBorrowedBooks() {
        this.borrowedBooks++;
    }
    // Method to decrement the number of borrowed books
    // Called when a member returns a book
    // Ensures the value does not go below zero
    public void decrementBorrowedBooks() {
        if (this.borrowedBooks > 0) {
            this.borrowedBooks--;
        }
    }
    // toString method
    // Returns a string representation of the Member object
    // Includes all key member details
    @Override
    public String toString() {
        return 
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
 
