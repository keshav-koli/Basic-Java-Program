package Polymorphism.CompileTimePolymorhism;

public class TestVehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Vehicle v=new Car();
        v.start();
        
    }
}
