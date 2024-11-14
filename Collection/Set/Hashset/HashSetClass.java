package Collection.Set.Hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add(null);
		fruits.add(null);
		fruits.add("apple");
		
		System.out.println(fruits);
    }
}
