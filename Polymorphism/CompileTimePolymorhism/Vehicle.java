package Polymorphism.CompileTimePolymorhism;

public class Vehicle {
    public static void start() {
        System.out.println("starting...");
    }
}

class Car extends Vehicle {
    public static void start() {
        System.out.println("car is starting");
    }
}
