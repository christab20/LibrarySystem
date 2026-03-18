package com.mycompany.lms;



// StaffMember.java
public class StaffMember extends Member {
    private int maxBooks = 10;

    public StaffMember(int memberId, String name, String email, int borrowedBooks) {
        super(memberId, name, email, borrowedBooks);
    }

    @Override
    public int getMaxBooks() {
        return maxBooks;
    }

    public void setMaxBooks(int maxBooks) {
        this.maxBooks = maxBooks;
    }

     @Override
    public void incrementBorrowedBooks() {
        if (getBorrowedBooks() < maxBooks) {
            super.incrementBorrowedBooks();
        } else {
            System.out.println("Cannot borrow more books! Limit reached.");
        }
    }
    @Override
    public void decrementBorrowedBooks() {
        if (getBorrowedBooks() > 0) {
            super.decrementBorrowedBooks();
        }
    }
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
