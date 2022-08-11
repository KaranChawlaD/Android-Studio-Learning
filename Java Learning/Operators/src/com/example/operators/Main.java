package com.example.operators;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

//        boolean answer = a != b; // a > b, a < b, a == b, a >= b, a <= b, a != b
//        System.out.println(answer);

//        boolean answer = a == 5 && b == 2; // || = OR, && = AND
//        System.out.println(answer);

        boolean answer = a>3;

//        if (answer) {
//            System.out.println("A is greater than 3");
//        } else {
//            System.out.println("A is less than 3");
//        }

//        if (a>0) {
//            System.out.println("A is positive");
//        } else if (a<0) {
//            System.out.println("A is negative");
//        } else {
//            System.out.println("A is zero");
//        }

        switch (a) {
            case 1:
                System.out.println("A is one");
                break;
            case 2:
                System.out.println("A is two");
                break;
            case 3:
                System.out.println("A is three");
                break;
            default:
                System.out.println("A is not one, two, or three");
                break;
        }

        System.out.println("Continue ...");
    }
}
