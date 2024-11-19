package Collection.Comparator.car;

public class Car {
    String brand;
    float price;
    int seat;

    public Car(String brand ,int seat , float price){
        this.brand=brand;
        this.seat=seat;
        this .price=price;
    }

    public String toString(){
        return "Brand: "+brand +" , "+" No. of seats: "+ seat+" , "+" Price: "+price;
    }
}
