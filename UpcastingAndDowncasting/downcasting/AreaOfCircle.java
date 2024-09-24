package UpcastingAndDowncasting.downcasting;

public class AreaOfCircle extends Shape {
    double radius;
    public void area_of_circle(double radius){
        this.radius=radius;
        System.out.println("Area of circle is "+3.14*radius*radius);
    }
}
