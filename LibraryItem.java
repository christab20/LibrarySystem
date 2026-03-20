package com.mycompany.lms;

// LibraryItem.java
// This class represents a general item in the library

public class LibraryItem {

    private String title;
    private boolean available;
    private int itemId;

    // Constructor
    public LibraryItem(String title, boolean available, int itemId) {
        this.title = title;
        this.available = available; // fixed spelling
        this.itemId = itemId;       // fixed semicolon
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
               "title='" + title + '\'' +
               ", available=" + available +
               ", itemId=" + itemId +
               '}';
    }
}
  
