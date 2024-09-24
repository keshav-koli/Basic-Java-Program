package UpcastingAndDowncasting.downcasting;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new AreaOfRectangle();
        s1.shape("Rectangle");
        AreaOfRectangle A1 = (AreaOfRectangle) s1;
        A1.area_of_rectangle(4, 8);

        Shape s2 = new AreaOfSquare();
        s2.shape("Square");
        AreaOfSquare A2 = (AreaOfSquare) s2;
        A2.area_of_square(8);
        Shape s3=new AreaOfCircle();
        s3.shape("Circle");
        AreaOfCircle A3=(AreaOfCircle)s3;
        A3.area_of_circle(5.6);
        

    }
}
