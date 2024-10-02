package Polymorphism.RunTimePolymorphism.MethodOverriding;

public class Animal {
    public void sound(){
        System.out.println("Bolne Lagi");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Bhauuuuu...");
    }
}
