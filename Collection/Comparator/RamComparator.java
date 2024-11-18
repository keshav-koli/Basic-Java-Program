package Collection.Comparator;
import java.util.Comparator;
public class RamComparator  implements Comparator<Laptop>{
    public int compare(Laptop l1,Laptop l2){
        return l1.ram-l2.ram;
    }
}
