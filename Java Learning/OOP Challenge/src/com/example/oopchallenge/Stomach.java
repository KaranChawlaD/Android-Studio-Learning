package com.example.oopchallenge;

public class Stomach extends Organ{
    private boolean needFood;

    public Stomach(String name, String medicalCondition, boolean needFood) {
        super(name, medicalCondition);
        this.needFood = needFood;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Need to be fed: " + this.isNeedFood());
    }

    public boolean isNeedFood() {
        return needFood;
    }

    public void setNeedFood(boolean needFood) {
        this.needFood = needFood;
    }
}
