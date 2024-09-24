package Polymorphism.CompileTimePolymorhism;

public class Vehicle {
    public static void start() {
        System.out.println("starting...");
    }
}

class car extends Vehicle {
    public static void start() {
        System.out.println("car is starting");
    }
}
