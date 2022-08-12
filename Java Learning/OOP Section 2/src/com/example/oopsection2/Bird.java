package com.example.oopsection2;

public class Bird extends Animal{

    private int wings;

    public Bird(String name, String colour, int legs, boolean hasTail, int wings) {
        super(name, colour, legs, hasTail);
        this.wings = wings;
    }

    @Override
    public void eat(String food) {
        System.out.println("Chewing " + food);
    }

    public void fly () {
        System.out.println(this.getName() + " is flying");
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
