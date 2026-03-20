package com.mycompany.lms;

//MemberTest.java
//This class is used to test the functionality of Member,StudentMember, and StaffMmember classes

public class MemberTest {
    public static void main(String[] args) {
        
        //Display heading for test output 
        System.out.println("=== Member Class Tests ===");

        // -------------------- TEST STUDENT MEMBER --------------------
        //Create a StudentMember object 
        //memberID = 101, name = "Alice", email = alice@example.com, borrowedBooks = 0 
        StudentMember student = new StudentMember (101,  "Alice", "alice@example.com" , 0);
        
        //Display the created student onject using toString()

        System.out.println("\nCreated Student Member:");
        System.out.println(student);

        // Test getters Name, Email, Borrowed Books, Borrow Limit
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Borrowed Books: " + student.getBorrowedBooks());
        System.out.println("Borrow Limit: " + student.getMaxBooks());


        // Test setter methods (update name and email)
        student.setName("Alice Smith");
        student.setEmail("alice.smith@example.com");

        
        // Display updated student details
        System.out.println("\nUpdated Student Member:");
        System.out.println(student);

        // Test borrow books increment/decrement
        System.out.println("\nSimulate borrowing 3 books...");
        student.incrementBorrowedBooks();
        student.incrementBorrowedBooks();
        student.incrementBorrowedBooks();


       // Display number of borrowed books
        System.out.println("Borrowed Books: " + student.getBorrowedBooks()); // 3

        // Test returning books
        // Simulate returning 2 books
        System.out.println("Simulate returning 2 books...");
        student.decrementBorrowedBooks();
        student.decrementBorrowedBooks();

        
        // Display updated number of borrowed books
        System.out.println("Borrowed Books: " + student.getBorrowedBooks()); // 1

        // -------------------- TEST STAFF MEMBER --------------------
        //Create a staff member 201, "Bob", bob@example.com
     StaffMember staff = new StaffMember(201, "Bob", "bob@example.com", 0);
// Display the created staff member
        System.out.println("\nCreated Staff Member:");
        System.out.println(staff);

        // Test getter methods
        System.out.println("Name: " + staff.getName());
        System.out.println("Email: " + staff.getEmail());
        System.out.println("Borrowed Books: " + staff.getBorrowedBooks());
        System.out.println("Borrow Limit: " + staff.getMaxBooks());

        // Test setter methods
        // Update staff details
        staff.setName("Bob Johnson");
        staff.setEmail("bob.johnson@example.com");

        // Display updated staff details
        System.out.println("\nUpdated Staff Member:");
        System.out.println(staff);

        // Test borrowing books
        System.out.println("\nSimulate borrowing 5 books...");
        for (int i = 0; i < 5; i++) {
            staff.incrementBorrowedBooks();
        }
        
        //Display number of borrwed books 
        System.out.println("Borrowed Books: " + staff.getBorrowedBooks()); // Expected: 5

        // Test returning books
        System.out.println("Simulate returning 3 books...");
        for (int i = 0; i < 3; i++) {
            staff.decrementBorrowedBooks();
        }
    
        //Display updated number of borrwed books 
        System.out.println("Borrowed Books: " + staff.getBorrowedBooks()); // Expected: 2
    
        //End of test
        System.out.println("\n=== Member Tests Completed ===");
    }
}
