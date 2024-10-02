package Polymorphism.CompileTimePolymorphism.MethodOverloading;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Output: Animal sound
        animal.sound("Dog"); // Output: Dog sound
    }
}
