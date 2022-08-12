package com.example.oopsection1;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 11", 5, 8, 8);

        System.out.println(iPhone.getName());

        iPhone.playMusic("Boogie Wonderland");
        iPhone.playMusic("Smooth Criminal");

        Phone pixel = new Phone("Pixel 3", 16);
    }
}
