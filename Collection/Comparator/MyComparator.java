package Collection.Comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Character> {
    public int compare(Character c1, Character c2) {
        return c2 - c1;
    }

}
