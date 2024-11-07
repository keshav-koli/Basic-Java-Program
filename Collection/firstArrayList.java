package Collection;
import java.util.Collection;
import java.util.ArrayList;

class firstArrayList {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("Apple");
        c.add(80);
        c.add(true);
        System.out.println(c);
        Collection c2=new ArrayList();
        c2.add("mango");
        c2.add(1.25);
        c2.add(52);
        c.addAll(c2);
        System.out.println(c2);
        System.out.println("After adding C2 collection "+c);
        System.out.println(c.remove(true));
        System.out.println(c);
        c.removeAll(c2);
        System.out.println(c);

    }
}