package com.pluralsight;

import java.util.Scanner;

public class NameParserApplication {

    public static void main(String[] args) {

        // starts scanner to get user input
        Scanner userName = new Scanner(System.in);

        // tells user to enter name
        System.out.println("Enter Name: \"First Last\" or \"First Middle Last\" ");

        // takes user input and puts it in variable name
        String name = userName.nextLine().trim();

        // uses split to split name
        String[] nameParts = name.split(" ");

        // variables
        String firstName = "";
        String middleName = "";
        String lastName = "";

        // checks to see if user has 2 or 3 parts
        if (nameParts.length == 2) {
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        }

        // displays users name parsed out
        System.out.println("\nFirst Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);


    }
}
