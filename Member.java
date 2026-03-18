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
    public Member(int memberId, String name, String email, int borrowedBooks) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.borrowedBooks = borrowedBooks;
    }
    //Getter for memberId
    public int getMemberId() {
        return memberId;
    }
    //Setter for memberId
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public int getMaxBooks() {
        return 0; // base class default (overridden in StudentMember or StaffMember)
    }

 public void incrementBorrowedBooks() {
        this.borrowedBooks++;
    }

    public void decrementBorrowedBooks() {
        if (this.borrowedBooks > 0) {
            this.borrowedBooks--;
        }
    }
    public String toString() {
        return 
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
 
