library item package com.mycompany.lms;
 
// LibraryItem.java
//This class represents a general item in the library 
// It is the parent class for items like Book, DVD, etc.


public class LibraryItem {

    //Variable to store the title of the library item 

    private String title;

    //Variable to store weether the item is available or not

    private boolean available;

    //Variable to store the unique ID of the item 

    private int itemId;

// Constructor to create a new LibraryItem object
    // Parameters:
    // title - the name of the item
    // available - indicates if the item is available
    // itemId - unique identifier for the item
 
    public LibraryItem(String title, boolean available, int itemId) {

       //Assign values to instance variables
       this.title = title;
       this.availiable = available;
       this.itemId = itemId

    }
 
   //Getter method for title
 //Returns the title of the item
    public String getTitle() {
        return title ;

    }
  // Setter method for title
    // Allows updating the title of the item
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for availability
    // Returns true if the item is available, false otherwise
    public boolean isAvailable() {
        return available;
    }

    // Setter method for availability
    // Allows updating the availability status
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Getter method for item ID
    // Returns the unique ID of the item
    public int getItemId() {
        return itemId;
    }

    // Setter method for item ID
    // Allows updating the item ID
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    // toString method
    // Returns a string representation of the LibraryItem object
    // Includes key details of the item
    @Override
    public String toString() {
        return "LibraryItem{" +
               "title='" + title + '\'' +
               ", available=" + available +
               ", itemId=" + itemId +
               '}';
    }
}
  
