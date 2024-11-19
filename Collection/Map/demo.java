package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        Map m=new HashMap();
        m.put("Samosa",20);
        m.put("Burger",50);
        m.put("Pasta",80);
        m.put("Pizza",100);
        System.out.println(m);

        Map m1=new HashMap();
        System.out.println("Before adding "+m1);
        m1.putAll(m);
        System.out.println("after adding "+m1);

        System.out.println(m.containsKey("Samosa"));
        System.out.println(m.containsValue(30));
        System.out.println(m.remove("Samosa"));
        System.out.println("after removing"+m);


    }
}
