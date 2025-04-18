package com.pluralsight;

import java.util.Scanner;

public class HighScoreWinsApplication {

    public static void main(String[] args) {

        //starts scanner to get user input
        Scanner userInput = new Scanner(System.in);

        //tells user to enter scores
        System.out.println("Enter game scores: (Home:Visitor|21:9)");

        //take user input and stores it
        String gameScores = userInput.nextLine().trim();

        //split team from score on |
        String[] teamScores = gameScores.split("\\|");

    }
}
