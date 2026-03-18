package com.mycompany.lms;

// StudentMember.java

public class StudentMember extends Member {

    private int maxBooks = 5;

    public StudentMember(int memberId, String name, String email, int borrowedBooks) {
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
