package com.mycompany.lms;

/**
 *
 * @author ChristaBobymon
 */
// Loan.java 
public class Loan { 
    private Member member; 
    private Book book; 

    // Constructor
    public Loan(Member member, Book book) { 
         // Check if the book is available
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is not available.");  
    } 
  // Check if member can borrow more books
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

    @Override
    public String toString() {
        return "Loan{" +
               "member=" + member.getName() +
               ", book=" + book.getTitle() +
               '}';
    }
}
