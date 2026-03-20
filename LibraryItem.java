package com.mycompany.lms;
// LibraryItem.java
 
// This class represents a general item in the libraryItem
public class LibraryItem {
    //Variable to store the title of the library item
    private String title;
    //Variable to store whether the item is available or not 
    private boolean available;
    //Variable to store/see the unique ID of the item 
    private int itemId;
    // Constructor
    //This is used to create a a ne LibraryItem object
    //Title- title of the item 
    //Availability - if the book is available or not 
    //ItemId - an unique identification of the item 

 
    public LibraryItem(String title, boolean available, int itemId) {
      //Assign value to the class variables
        this.title = title;
 
        this.available = available;
 
        this.itemId = itemId;       
 
    }
     //Getter method for the title
    //Returns the Title of the item
    public String getTitle() {
 
        return title;
 
    }
      //Setter method for the title 
    //Allows Changing the title of the item 
    public void setTitle(String title) {
 
        this.title = title;
 
    }
     //Getter method for availability 
    //Returns True if the Item is available 
    public boolean isAvailable() {
 
        return available;
 
    }
      //Setter method for availability 
      //Allows changing the availability status
    public void setAvailable(boolean available) {
 
        this.available = available;
 
    }
     //Getter method for Item ID
     //Returns the unique Item ID
    public int getItemId() {
 
        return itemId;
 
    }
      //Setter method for Item ID
     //Allows updating the Item ID
    public void setItemId(int itemId) {
 
        this.itemId = itemId;
 
    }
//toString method
    //Returns a readable description of the LibraryItem object
    @Override
 
    public String toString() {
 
        return "LibraryItem{" +
               "title='" + title + '\'' +
               ", available=" + available +
               ", itemId=" + itemId +
               '}';
 
    }
 
}
