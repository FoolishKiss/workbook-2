package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibraryApp {

     //initialize list of books, int for book count, and scanner
     static Book[] books = new Book[20];
     static int bookCount = 5;
     static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        //starting book list
        books[0] = new Book(1, "ISBN001", "Java for Dummies");
        books[1] = new Book(2, "ISBN002", "Java in the morning: Java puzzles to start your day");
        books[2] = new Book(3, "ISBN003", "Intro to Java");
        books[3] = new Book(4, "ISBN004", "Java for Smarties");
        books[4] = new Book(5, "ISBN005", "Java for Dummies Field Guide");


        //loop to keep main screen running until user exits the app
        label:
        while (true) {

            System.out.println("\nNeighborhood Library" );
            System.out.println("1. Show Available Books" );
            System.out.println("2. Show Checked Out Books" );
            System.out.println("3. Donate Book" );
            System.out.println("4. Exit" );
            System.out.println("Enter choice: " );

            String userChoice = userInput.nextLine();

            // takes user input and calls relevant method or exits the app
            switch (userChoice) {
                case "1":
                    showAvailableBooks();
                    break;
                case "2":
                    showCheckedOutBooks();
                    break;
                case "3":
                    donateBook();
                    break;
                case "4":
                    System.out.println("Bye!");
                    break label;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }

    //Show available books method
    static void showAvailableBooks() {
        //shows user available books by looping through the list and prints the available books
        System.out.println("\n Available Books:");
        //loop through the books and shows only available books
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            //if the book is not checked out print it
            if (!book.isCheckedOut()) {
                System.out.println(book.getId() + ": " + book.getTitle() + " (" + book.getIsbn() + ")");
            }
        }

        //ask user what they want to do
        System.out.println("Enter book ID to check out or X to return: ");
        String userCheckOutAnswer = userInput.nextLine();

        /* checks if user input was not x or X,
        so it can only run if user wants to check out book
        */
        if (!userCheckOutAnswer.equalsIgnoreCase("x")) {
            //uses helper method to check if number then its valid
            if (isNumeric(userCheckOutAnswer)) {
                int id = Integer.parseInt(userCheckOutAnswer);
                // looks for a book with that id and that is not checked out
                for (int i = 0; i < bookCount; i++) {
                    Book book = books[i];
                    if (book.getId() == id && !book.isCheckedOut()) {
                        System.out.println("Enter your name: ");
                        String userName = userInput.nextLine();
                        book.checkOut(userName);
                        System.out.println("You checked out: " + book.getTitle());
                        return;
                    }
                }
                // if not found or
                System.out.println("Book not found or already checked out.");
            } else {
                //invalid input
                System.out.println("Invalid input.");
            }

        }
    }

    //
    static void showCheckedOutBooks() {
        System.out.println("\nChecked out Books:");
        //loops through the books and only shows the checked out books
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            //checks if book is checked out
            if(book.isCheckedOut()) {
                System.out.println(book.getId() + ": " + book.getTitle() + " - Checked out to: " + book.getCheckedOutTo() );
            }
        }
        //ask user
        System.out.println("Enter book ID to check in or X to return: ");
        String userCheckInAnswer = userInput.nextLine();

        //if user types x or X exit the method
        if (!userCheckInAnswer.equalsIgnoreCase("X")) {
            //uses helper method to check if number then its valid
            if (isNumeric(userCheckInAnswer)) {
                int id = Integer.parseInt(userCheckInAnswer);
                for (int i = 0; i < bookCount; i++) {
                    Book book = books[i];
                    /* takes user input and checks if it matches the books id and
                    if it is checked out then it returns it
                    */
                    if (book.getId() == id && book.isCheckedOut()) {
                        book.checkIn();
                        System.out.println("Book checked in!");
                        return;
                    }
                }
                //if not book matches
                System.out.println("Book not found or checked out.");
            } else {
                //if input was not a number
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    static void donateBook() {
        if (bookCount >= books.length) {
            System.out.print("Sorry, the library is full.");
            return;
        }
        System.out.print("Enter book title");
        String title = userInput.nextLine();

        System.out.print("Enter book isbn");
        String isbn = userInput.nextLine();

        Book newBook = new Book(isbn, title);
        books[bookCount] = newBook;
        bookCount++;

        System.out.print("thanks for donating");

    }

    //helper method to check if a string has a digit to stop errors
    static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }



}

