package com.example.oopchallenge;

public class Heart extends Organ{
    private int heartRate;

    public Heart(String name, String medicalCondition, int heartRate) {
        super(name, medicalCondition);
        this.heartRate = heartRate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart Rate: " + this.getHeartRate());
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
