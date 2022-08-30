package com.example.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissors, What is your name?");
        String name = scanner.next();

        int decision = 2;

        while (decision == 2) {

            System.out.println("Hello " + name + ". Shall we begin?");
            System.out.println("\t 1. Begin");
            System.out.println("\t 2. Do not begin");
            decision = scanner.nextInt();

        }

        int Continue = 1;

        while (Continue == 1) {
            System.out.println("What do you select?");
            System.out.println("\t 1. Rock");
            System.out.println("\t 2. Paper");
            System.out.println("\t 3. Scissors");

            decision = scanner.nextInt();

            Random random = new Random();
            int botSelection = random.nextInt(0, 2);

            String[] options = new String[3];
            options[0] = "Rock";
            options[1] = "Paper";
            options[2] = "Scissors";

            System.out.println("I chose " + options[botSelection] + "!");

            if (botSelection + 1 == decision) {
                System.out.println("It's a tie!");
            } else if (botSelection + 1 == decision + 1) {
                System.out.println("I win!");
            } else {
                System.out.println("You win!");
            }

            System.out.println("Would you like to continue?");

            System.out.println("\t 1. Yes");
            System.out.println("\t 2. No");

            Continue = scanner.nextInt();
        }
    }
}
