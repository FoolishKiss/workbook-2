package com.pluralsight;

//
public class Book {
    // traits of a book
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //constructor to create books
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    static int nextid = 6;

    //Overloaded constructor for donated  books
    public Book(String isbn, String title) {
        this.id = nextid++;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // getters
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    // Checkout method when user checks out a book
    public void checkOut (String name) {
        isCheckedOut = true;
        checkedOutTo = name;
    }

    // Check in method called when user returns book
    public void checkIn() {
        isCheckedOut = false;
        checkedOutTo = "";
    }

}
