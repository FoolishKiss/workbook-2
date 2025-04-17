package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApplication {

    public static void main(String[] args) {

        //starts scanner to get user input
        Scanner userApplication = new Scanner(System.in);

        //ask user for name
        System.out.println("what is your full name?: ");
        String fullName =  userApplication.nextLine();

        //ask user for billing address
        System.out.println("what is your billing address?: \n");

        //user inputs street
        System.out.println("Street: ");
        //stores in variable billing
        String billingStreet =  userApplication.nextLine().trim();

        //user inputs state
        System.out.println("City: ");
        //stores in variable billing
        String billingCity =  userApplication.nextLine().trim();

        //user inputs state
        System.out.println("State: ");
        //stores in variable billing
        String billingState =  userApplication.nextLine().trim();

        //user inputs zip
        System.out.println("Zip: ");
        //stores in variable billing
        String billingZip =  userApplication.nextLine().trim();

        //ask user for shipping address
        System.out.println("what is your shipping address?: \n");

        //user inputs street address
        System.out.println("Street: ");
        //stores in variable shippingStreet
        String shippingStreet =  userApplication.nextLine().trim();

        //user inputs city
        System.out.println("City: ");
        //stores in variable shippingCity
        String shippingCity =  userApplication.nextLine().trim();

        //user inputs state
        System.out.println("State: ");
        //stores in variable shippingState
        String shippingState =  userApplication.nextLine().trim();

        //user inputs zip
        System.out.println("Zip: ");
        //stores in variable shippingZip
        String shippingZip =  userApplication.nextLine().trim();

        //starts string builder to store strings user info into variable userInformation
        StringBuilder userInformation = new StringBuilder();

        //appends fullName to userInformation
        userInformation.append("\n").append(fullName).append("\n\n");

        //appends billing address to end of userInformation
        userInformation.append("Billing Address:\n");
        userInformation.append(billingStreet).append("\n");// adds space between the lines
        userInformation.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n\n");

        //appends shipping to the end of userInformation
        userInformation.append("Shipping Address:\n");
        userInformation.append(shippingStreet).append("\n");// adds space between the lines
        userInformation.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip).append("\n\n");


        //shows user summary
        System.out.println("\n" + userInformation);

    }
}
