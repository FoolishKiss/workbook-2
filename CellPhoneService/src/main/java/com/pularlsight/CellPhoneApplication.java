package com.pularlsight;

import java.util.Scanner;

public class CellPhoneApplication {

    //start scanner outside of class so it can be used without having to call it each time
    static Scanner userInfo = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone myPhone = new CellPhone();

        System.out.println("What is the serial number?: ");
        String sn = userInfo.nextLine();

        System.out.println("What is the model of the phone?: ");
        String model = userInfo.nextLine();

        System.out.println("What is the carrier?: ");
        String carrier = userInfo.nextLine();

        System.out.println("What is the number?: ");
        String phoneNumber = userInfo.nextLine();

        System.out.println("Who is owner of this phone?: ");
        String owner = userInfo.nextLine();

        myPhone.setSerialNumber(Integer.parseInt(sn));
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());



    }
}
