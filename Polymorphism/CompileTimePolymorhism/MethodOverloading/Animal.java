package Polymorphism.CompileTimePolymorhism.MethodOverloading;

public class Animal {
    public void sound(){
        System.out.println("The animal makes a sound");
        
    }
}
class  Dog extends Animal {
    public void sound() {
        System.out.println("The Dog makes a bark");
    }
}