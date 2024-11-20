package Collection.Map.sortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class demo {
    public static void main(String[] args) {
        SortedMap m=new TreeMap();
        m.put("Samosa",20);
        m.put("Burger",50);
        m.put("Pasta",80);
        m.put("Noodles",40);
        m.put("Dosa",30);
        m.put("Pizza",100);
        // m.put(null,90);//NullPointerException
        // m.put(20,"Samosa");//ClassCastException
        m.put("Samosa",null);
        System.out.println(m.firstKey());
        System.out.println(m);  

    }
}
