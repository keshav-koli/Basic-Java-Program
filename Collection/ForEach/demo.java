package Collection.ForEach;
import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i : arr) {
            System.out.println(i);
        }


         List<Car> l = new ArrayList<>();
         Car c1 = new Car("Tata", 4, 500000);
         Car c2 = new Car("Honda", 6, 800000);
         Car c3 = new Car("Maruti", 8, 1000000);
         l.add(c1);
         l.add(c2);
         l.add(c3);
         for (Car s : l) {
         System.out.println(s.price);
         }
    }
    
}
