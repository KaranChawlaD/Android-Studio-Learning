package com.example.oopsection3;

public class Car {
    private String name;
    private int doors;
    private String colour;
    private Engine engine;

    public Car(String name, int doors, String colour, Engine engine) {
        this.name = name;
        this.doors = doors;
        this.colour = colour;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Returns the engine of our car
     * @return
     */

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
