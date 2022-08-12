package com.example.loops;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 5;

//        for (int i = 0; i < a; i++) {
//            System.out.println("Hello");
//            System.out.println(i);
//        }

//        while (a<10) {
//            if (a==8) {
//                continue; //Skips iteration and goes to next
//            }
//
//            System.out.println("Hello");
//
//            a ++ ; // Can also use break; to get out of while loop
//        }

//        do {
//            System.out.println("Hello");
//        } while (a<5);

        // User input
//        System.out.println("Please input a number:");
//        Scanner scanner = new Scanner(System.in);
//        int answer = scanner.nextInt();
//        System.out.println("Answer was: " + answer);
//
//        System.out.println("Enter your name:");
//        String name = scanner.next();
//        System.out.println("Hello " + name);

        // Generate Random Number
        Random random = new Random();
        int number = random.nextInt(20); //Restricts randomness to [0, 19] domain
        System.out.println("number: " + number);
    }
}
