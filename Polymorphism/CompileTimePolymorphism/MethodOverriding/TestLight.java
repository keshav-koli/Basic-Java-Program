package Polymorphism.CompileTimePolymorphism.MethodOverriding;

public class TestLight {
    public static void main(String[] args) {
        Light L1=new Led();
        L1.turnOff();
        L1.turnOn();
        Light L2=new Tubelight();
        L2.turnOff();
        L2.turnOn();
    }
}
