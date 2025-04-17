package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservationsApplication {

    static DateTimeFormatter reservationDateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public static void main(String[] args) {

        //starts scanner to get user input
        Scanner userReservations = new Scanner(System.in);

        //ask user for full name
        System.out.println("Enter Full Name: ");
        // stores user input in variable fullName
        String fullName = userReservations.nextLine().trim();

        //takes variable fullName and splits it at the spaces
        String[] nameParts = fullName.split(" ");
        //stores that the split names in reverseName variable
        String reverseName = nameParts[1] + ", " + nameParts[0];

        //ask user for date in MM/dd/yyyy format
        System.out.println("Enter Reservation Date (MM/dd/yyyy): ");
        //stores user input in variable
        LocalDate reservationDate = LocalDate.parse(userReservations.nextLine().trim(),reservationDateFormatter);

        //ask user for how many tickets
        System.out.println("Enter How Many Tickets: ");
        //stores user input in variable
        int ticketCount = userReservations.nextInt();

        // Determines if ticket or ticket(s)
        String tickets;
        if (ticketCount == 1){
            tickets = "ticket";
        }else {
            tickets = "tickets";
        }

        //tells user reservation summary
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(ticketCount + " " + tickets + " reserved for " + reservationDate + " under " + reverseName);






    }
}
