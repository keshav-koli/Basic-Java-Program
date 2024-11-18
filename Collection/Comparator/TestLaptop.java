package Collection.Comparator;

import java.util.TreeSet;

public class TestLaptop {
    public static void main(String[] args) {
        TreeSet<Laptop> lt=new TreeSet<>(new RamComparator());
        Laptop l1=new Laptop("Asus", 8, 50000);
        Laptop l2=new Laptop("Lenovo", 4, 30000);
        Laptop l3=new Laptop("Dell", 16, 70000);
        lt.add(l1);
        lt.add(l2);
        lt.add(l3);
        System.out.println(lt);
        
    }
}
