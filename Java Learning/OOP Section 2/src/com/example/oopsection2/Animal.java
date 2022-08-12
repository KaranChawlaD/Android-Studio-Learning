package com.example.oopsection2;

public class Animal {
    private String name;
    private String colour;
    private int legs;
    private boolean hasTail;

    public Animal(String name, String colour, int legs, boolean hasTail) {
        this.name = name;
        this.colour = colour;
        this.legs = legs;
        this.hasTail = hasTail;
    }

    public void eat (String food) {
        System.out.println("Eating " + food);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
