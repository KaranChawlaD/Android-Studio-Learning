package com.example.oopsection3;

public class Main {
    public static void main(String[] args) {
//        Engine engine = new Engine("Renault", 8000);
//        Car mercedes = new Car("Mercedes AMG", 2, "Silver", new Engine("Renault", 8000)); // Can use engine object in last parameter too
//
//        System.out.println(mercedes.getName());
//
////        Engine engine = mercedes.getEngine();
//        System.out.println("Engine Model: " + mercedes.getEngine().getModel()); // Can be replaced with engine

//        Car mercedes = null;
//
//        if (mercedes != null) {
//            mercedes.getName();
//        } else {
//            System.out.println("The car was null");
//        }

//        final int a = 5;
////        a ++; NOT ALLOWED

        final Engine engine = new Engine("Renault", 8000);
        engine.setRpm(10000); //Can still change properties in final class objects
    }
}
