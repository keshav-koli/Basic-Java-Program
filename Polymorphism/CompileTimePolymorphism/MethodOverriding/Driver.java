package Polymorphism.CompileTimePolymorphism.MethodOverriding;

public class Driver {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
    }
}
