package Abstraction;

public abstract class Calculator{
    abstract void add(int a, int b);
    abstract void subtract(int a, int b);
    abstract void multiply(int a, int b);
    abstract void divide(int a, int b);
    abstract void power(int a,int b);
}

class Functionality extends Calculator{
    public void add (int a,int b){
        System.out.println("Addition is " +a+b );
    } 
    public void subtract (int a,int b){
        System.out.println("subtraction is " +a+b );
    } 
    public void multiply (int a,int b){
        System.out.println("multiply is " +a+b );
    } 
    public void divide (int a,int b){
        System.out.println("divide is " +a+b );
    }
    public void power (int a,int b){
        System.out.println("divide is " +a+b );
    }
}

