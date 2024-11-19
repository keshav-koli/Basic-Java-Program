package Collection.Comparator.car;

// import java.util.List;
import java.util.Scanner;
// import java.util.ArrayList;
import java.util.TreeSet;

public class TestCar {
    public static void main(String[] args) {
        // List<Car> l = new ArrayList<>();
        Car c1 = new Car("Tata", 4, 500000);
        Car c2 = new Car("Honda", 6, 800000);
        Car c3 = new Car("Maruti", 8, 1000000);
        // l.add(c1);
        // l.add(c2);
        // l.add(c3);
        // for (Car s : l) {
        // System.out.println(s.price);
        // }
        TreeSet<Car> t = null;// upcasting
        System.out.println("Do you want to compare using : \nPrice \nBrand \nSeat");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                t = new TreeSet<>(new PriceComparator());
                break;
            case 2:
                t = new TreeSet<>(new BrandComparator());
                break;
            case 3:
                t = new TreeSet<>(new SeatComparator());
                break;

            default:
                break;
        }
        t.add(c1);
        t.add(c2);
        t.add(c3);
        System.out.println(t);
        sc.close();
    }
}
