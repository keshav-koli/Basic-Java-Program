package Polymorphism.CompileTimePolymorphism.MethodOverloading;

public class Animal {
    public void sound(){
        System.out.println("The animal makes a sound");
        
    }
    public void  sound(String animalType){
        System.out.println("The animal makes a sound"+animalType);
    }
    public void  sound(String animalType, int volume){
        System.out.println("Type Of  Animal: "+animalType+" Volume: "+volume);
    }
}