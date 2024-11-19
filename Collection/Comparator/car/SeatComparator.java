package Collection.Comparator.car;

import java.util.Comparator;

public class SeatComparator  implements Comparator<Car>{
    public int compare(Car c1,Car c2){
        return c1.seat-c2.seat;

    }
}
