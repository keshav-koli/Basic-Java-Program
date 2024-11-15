package Collection.Comparator;

import java.util.TreeSet;

public class TestComparator {
    public static void main(String[] args) {
        TreeSet<Character> mc = new TreeSet<>(new MyComparator());
        mc.add('A');
        mc.add('B');
        mc.add('C');
        mc.add('D');
        mc.add('E');

        System.out.println(mc);
    }
}
