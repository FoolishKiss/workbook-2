package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        // starts scanner to get user input
        Scanner userName = new Scanner(System.in);

        // tells user to enter name
        System.out.println("Enter Name");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // tells user to put in first name
        System.out.println("First name: ");

        // takes user input and puts it in variable firstName
        String firstName = userName.nextLine().trim();

        // tells user to put in middle name
        System.out.println("Middle name: ");

        // takes user input and puts it in variable middleName
        String middleName = userName.nextLine().trim().toUpperCase();

        // tells user to put in last name
        System.out.println("Last name: ");

        // takes user input and puts it in variable lastName
        String lastName = userName.nextLine().trim();

        // tells user to put in suffix
        System.out.println("Suffix: ");

        // takes user input and puts it in variable suffix
        String suffix = userName.nextLine().trim();

        // variable for full name
        String fullName = "";

        // if user puts in a middle name it adds it to full name
        if (middleName.length() > 0) {
            fullName = firstName + " " + middleName + " " + lastName;
        }else {
            fullName = firstName + " " + lastName;
        }

        // if user puts in a suffix it adds it to full name
        if (suffix.length() > 0) {
            fullName = fullName + ", " + suffix;
        }

        // shows users name
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\nFull Name: " + fullName);


    }
}
