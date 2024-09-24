package UpcastingAndDowncasting.downcasting;

public class AreaOfSquare extends Shape{
    int length;
    public void area_of_square(int a){
        this.length=a;
        System.out.println("Area of Square is "+this.length*this.length);
    }
}
