package com.example.helloworld;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello World");

        int number = -5;
        System.out.println(number);

        long myLong = 5;
        System.out.println(myLong);

        double myDouble = 4.5;
        System.out.println(myDouble);

        float myFloat = (float) 4.5;
        System.out.println(myFloat);

        char myChar = 'K';
        System.out.println(myChar);

        String myString = "Karan";
        System.out.println(myString);

        boolean myBoolean = true;
        System.out.println(myBoolean);


        int a = 5;
        int b = 2;

        int answer_add = a + b;
        int answer_sub = a - b;
        int answer_mul = a * b;
        double answer_div = (double) a / b;
        int answer_mod = a % b;

        System.out.println(answer_add);
        System.out.println(answer_sub);
        System.out.println(answer_mul);
        System.out.println(answer_div);
        System.out.println(answer_mod);


        String firstName = "Karan ";
        String lastName = "Chawla";
        String fullName = firstName + lastName;
        System.out.println(fullName);
    }
}
