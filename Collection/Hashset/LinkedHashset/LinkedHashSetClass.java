package Collection.Hashset.LinkedHashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        Set<Object> s = new LinkedHashSet<>();
        s.add(45);
        s.add(12);
        s.add("hello");
        s.add(45);
        s.add(null);
        System.out.println(s); 
    }
}
