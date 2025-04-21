package com.pularlsight;

import java.util.Scanner;

public class CellPhoneApplication {

    //start scanner
    static Scanner userInfo = new Scanner(System.in);

    public static void main(String[] args) {

        //spins up a new phone from the cellphone class
        CellPhone myPhone = new CellPhone();

        //ask user
        System.out.println("What is the serial number?: ");
        //stores user input into setter for Serial Number
        myPhone.setSerialNumber(Integer.parseInt(userInfo.nextLine()));;

        //ask user
        System.out.println("What is the model of the phone?: ");
        //stores user input into setter for Serial Number
        myPhone.setModel(userInfo.nextLine());

        //ask user
        System.out.println("What is the carrier?: ");
        //stores user input into setter for Serial Number
        myPhone.setCarrier(userInfo.nextLine());

        //ask user
        System.out.println("What is the number?: ");
        //stores user input into setter for Serial Number
        myPhone.setPhoneNumber(userInfo.nextLine());

        //ask user
        System.out.println("Who is owner of this phone?: ");
        //stores user input into setter for owner
        myPhone.setOwner(userInfo.nextLine());



        // phone #2
        CellPhone myPhone2 = new CellPhone();


        System.out.println("What is the serial number?: ");
        myPhone2.setSerialNumber(Integer.parseInt(userInfo.nextLine()));;

        System.out.println("What is the model of the phone?: ");
        myPhone2.setModel(userInfo.nextLine());

        System.out.println("What is the carrier?: ");
        myPhone2.setCarrier(userInfo.nextLine());

        System.out.println("What is the number?: ");
        myPhone2.setPhoneNumber(userInfo.nextLine());

        System.out.println("Who is owner of this phone?: ");
        myPhone2.setOwner(userInfo.nextLine());

         // prints out the display from the method
        System.out.println("\n --- Phone 1 ---");
        display(myPhone);

        System.out.println("\n --- Phone 2 ---");
        display(myPhone2);

        // prints out the dial method from cellphone class
        System.out.println();
        myPhone.dial(myPhone.getPhoneNumber());

        System.out.println();
        myPhone.dial(myPhone2.getPhoneNumber());

    }

    //display info from phone
    public static void display(CellPhone phone) {

        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }

}
