package Collection.Map.sortedMap;
import java.util.SortedMap;
import java.util.TreeMap;


public class Laptop implements Comparable<Laptop>{
    String brand;
    Laptop(String brand){
        this.brand=brand;
    }
    public String toString(){
        return brand;
    }
    public int compareTo(Laptop l){
        return this.brand.compareTo(l.brand);
    }

}

class testLaptop{
    public static void main(String[] args) {
        SortedMap<Laptop,Integer> m=new TreeMap<>();
        m.put(new Laptop("Dell"), 20000);
        m.put(new Laptop("HP"), 30000);
        m.put(new Laptop("Lenovo"), 40000);
        m.put(new Laptop("Apple"), 50000);
        m.put(new Laptop("Acer"), 60000);
        m.put(new Laptop("Asus"), 70000);
        m.put(new Laptop("Dell"),null);
        System.out.println(m);
    }
}