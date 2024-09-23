package UpcastingAndDownlasting.upcasting;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a=new Cat();//Upcasting
        Animal b=new Dog();//Upcasting
        a.eat();
        System.out.println(a);
        System.out.println(b);
    }
}
