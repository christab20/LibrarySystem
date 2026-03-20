package com.mycompany.lms;


// Loan.java
// This class represents a loan transaction between a Member and a Book
// It handles borrowing logic such as availability checks and borrowing limits
public class Loan { 
    // The member who is borrowing the book
    private Member member; 
    // The book being borrowed
    private Book book; 

    // Constructor
    // Creates a loan and applies validation rules
    public Loan(Member member, Book book) { 
         // Check if the book is available before allowing the loan
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is not available.");  
    } 
  // Check if the member has reached their borrowing limit
        if (member.getBorrowedBooks() >= member.getMaxBooks()) {
            throw new IllegalStateException("Borrow limit reached.");
        }

// Initialize member and book
        this.member = member;
        this.book = book;

        // Set book availability to false
        book.setAvailable(false);

        // Increment member's borrowed books
        member.incrementBorrowedBooks();
    }

    // Getter and setter methods
    public Member getMember() { return member; }
    public void setMember(Member member) { this.member = member; }

    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    // Return a readable loan summary
    public String getLoanDetails() {
        return "Loan Details: Member=" + member.getName() +
               ", Book=" + book.getTitle();
    }

     // toString method
    // Returns a string representation of the Loan object
    @Override
    public String toString() {
        return "Loan{" +
               "member=" + member.getName() +
               ", book=" + book.getTitle() +
               '}';
    }
}
