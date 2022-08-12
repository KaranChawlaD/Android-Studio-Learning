package com.example.oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Tom", 25);
        Eye leftEye = new Eye("Left Eye", "Short sighted", "Blue", false);
        Eye rightEye = new Eye("Right Eye", "Normal", "Blue", false);
        Heart heart = new Heart("Heart", "Normal", 65);
        Stomach stomach = new Stomach("Stomach", "PUD", true);
        Organ skin = new Organ("Skin", "burned");

        // Begin!
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (quit == false) {
            System.out.println("Choose an Organ:");
            System.out.println("\t1. " + leftEye.getName());
            System.out.println("\t2. " + rightEye.getName());
            System.out.println("\t3. " + heart.getName());
            System.out.println("\t4. " + stomach.getName());
            System.out.println("\t5. " + skin.getName());
            System.out.println("\t6. Quit");

            int userInput = scanner.nextInt();

            if (userInput == 1) {
                leftEye.getDetails();
                if (leftEye.isEyeClosed() == false) {
                    System.out.println("\t1. Close the Eye");
                    int response = scanner.nextInt();
                    if (response == 1) {
                        leftEye.setEyeClosed(true);
                        System.out.println(leftEye.getName() + " Closed");
                    }
                }
            } else if (userInput == 2) {
                rightEye.getDetails();
                if (rightEye.isEyeClosed() == false) {
                    System.out.println("\t1. Close the Eye");
                    int response = scanner.nextInt();
                    if (response == 1) {
                        rightEye.setEyeClosed(true);
                        System.out.println(rightEye.getName() + " Closed");
                    }
                }
            } else if (userInput == 3) {
                heart.getDetails();
                System.out.println("\t1. Change the heart rate");
                int response = scanner.nextInt();
                if (response == 1) {
                    System.out.println("Enter the new heart rate:");
                    response = scanner.nextInt();
                    heart.setHeartRate(response);
                    System.out.println("Heart rate changed to: " + heart.getHeartRate());
                }
            } else if (userInput == 4) {
                stomach.getDetails();
                if (stomach.isNeedFood()) {
                    System.out.println("\t1. Digest food");
                    int response = scanner.nextInt();
                    if (response == 1) {
                        System.out.println("Digesting Completed...");
                        stomach.setNeedFood(false);
                    }
                }
            } else if (userInput == 5) {
                skin.getDetails();
            } else {
                quit = true;
            }
        }
    }
}
