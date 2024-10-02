package Polymorphism.CompileTimePolymorphism.MethodOverriding;

public class Light {
    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}

class Led extends Light {
    public void turnOn() {
        System.out.println("Led is on");
    }

    public void turnOff() {
        System.out.println("Led is off");
    }
}

class Tubelight extends Light {
    public void turnOn() {
        System.out.println("Tubelight is on");
    }

    public void turnOff() {
        System.out.println("Tubelight is off");
    }
}