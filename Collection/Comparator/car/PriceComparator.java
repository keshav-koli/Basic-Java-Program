package Collection.Comparator.car;
import java.util.Comparator;

public class PriceComparator implements Comparator<Car> {
        public int compare(Car c1, Car c2) {
            return (int) (c1.price - c2.price);
        }
}
