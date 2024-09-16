package Inheritence;

public class Child extends Parent{
    static {
        System.out.println("static child  is executing");
    }
    public static void main(String[] args) {
        System.out.println(g);
    }
}
