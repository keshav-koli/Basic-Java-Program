package Collection.Comparator.car;

import java.util.Comparator;

public class BrandComparator implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        return c1.brand.compareTo(c2.brand);
    }
}
