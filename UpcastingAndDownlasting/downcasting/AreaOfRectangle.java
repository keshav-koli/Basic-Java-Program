package UpcastingAndDownlasting.downcasting;

public class AreaOfRectangle extends Shape{
    int length;
    int breadth;

    public void area_of_rectangle(int a,int b){
        this.length=a;
        this.breadth=b;
        System.out.println("Area of Rectangle is "+this.length*this.breadth);
    }
}
