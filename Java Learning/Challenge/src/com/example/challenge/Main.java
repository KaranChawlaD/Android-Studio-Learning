package com.example.challenge;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess The Number, the World's Most Popular Game");
        System.out.println("What may I call you by?");

        String name = scanner.next();

        System.out.println("Hello " + name + " It's a pleasure to have you on our game");
        System.out.println("May we proceed onwards with the game?");
        System.out.println("\t1 - Yes");
        System.out.println("\t2 - No");

        int response = scanner.nextInt();

        Boolean Found = false;
        int Iteration = 0;

        while (response != 1) {
            System.out.println("May we proceed onwards with the game?");
            System.out.println("\t1 - Yes");
            System.out.println("\t2 - No");
            response = scanner.nextInt();
        }

        Random random = new Random();
        int genNumber = random.nextInt(20);

        while (Found == false && Iteration < 5) {

            System.out.println("What is your guess?");
            int userNumber = scanner.nextInt();

            if (userNumber == genNumber) {
                System.out.println("Your guess is correct! You've won the game on guess #" + (Iteration+1));
                Found = true;
            } else if (userNumber > genNumber) {
                System.out.println("Your guess is incorrect! The generated number is lower than your guess");
            } else {
                System.out.println("Your guess is incorrect! The generated number is higher than your guess");
            }
            Iteration++;
        }

        if (Found == false) {
            System.out.println("Game Over! The correct answer was " + genNumber);
        }
    }
}
