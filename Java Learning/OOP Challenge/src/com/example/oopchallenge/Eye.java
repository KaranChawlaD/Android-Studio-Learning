package com.example.oopchallenge;

public class Eye extends Organ{
    private String colour;
    private boolean eyeClosed;

    public Eye(String name, String medicalCondition, String colour, boolean eyeClosed) {
        super(name, medicalCondition);
        this.colour = colour;
        this.eyeClosed = eyeClosed;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Colour: " + this.getColour());
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isEyeClosed() {
        return eyeClosed;
    }

    public void setEyeClosed(boolean eyeClosed) {
        this.eyeClosed = eyeClosed;
    }
}
