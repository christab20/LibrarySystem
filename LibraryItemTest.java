package com.mycompany.lms;

public class LibraryItemTest {

    public static void main(String[] args) {

        // Create a LibraryItem instance
        // title, availability, itemId
        LibraryItem item = new LibraryItem("Generic Item", true, 1001);

        System.out.println("=== LibraryItem Test ===");

        // -------------------- TEST GETTERS --------------------

        // Display the item ID
        System.out.println("Item ID: " + item.getItemId());

        // Display the title of the item
        System.out.println("Title: " + item.getTitle());

        // Display availability status (true = available, false = not available)
        System.out.println("Available: " + item.isAvailable());

        // -------------------- TEST SETTERS --------------------

        // Update the title of the item
        item.setTitle("Updated Item");

        // Change availability status to false (not available)
        item.setAvailable(false);

        // Display updated values
        System.out.println("Updated Title: " + item.getTitle());
        System.out.println("Updated Availability: " + item.isAvailable());

        // -------------------- TOGGLE AVAILABILITY --------------------

        // Set availability back to true
        item.setAvailable(true);

        // Display availability after toggling
        System.out.println("Availability after toggle: " + item.isAvailable());

        // -------------------- TEST toString --------------------

        // Print the full object using the toString method
        System.out.println("LibraryItem: " + item.toString());
    }
}
