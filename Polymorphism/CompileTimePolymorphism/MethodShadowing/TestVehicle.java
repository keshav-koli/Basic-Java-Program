package Polymorphism.CompileTimePolymorphism.MethodShadowing;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle.start();
        Car.start();
        // Car c = new Car();
        // c.start();
        // Vehicle v=new Car();
        // v.start();
    }
}
