package com.example.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String[] students = new String[5]; //Creates Array of Size 5
//        students[0] = "Name1";
//        students[1] = "Name2";
//        students[2] = "Name3";
//        students[3] = "Name4";
//        students[4] = "Name5";
//
////        System.out.println(students[2]);
//
//        String[] employees = {"Name1", "Name2", "Name3"};
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i< numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        String[] names = {"Jake", "Sarah", "Tom", "Brad", "Brain"};
        int[] numbers = {123456, 5465561, 8779845, 216541, 894845};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Enter a name: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for (int i = 0; i < numbers.length; i++) {
            if (name.equals(names[i])) {
                System.out.println(numbers[i]);
            }
        }
    }
}
