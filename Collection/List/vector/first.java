package Collection.List.vector;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class first {
    public static void main(String[] args) {
        List<Object> l=new Vector<>(); //Its object is Thread safe
        l.add("ayush");
        l.add("ram");
        l.add(45);
        l.add(45);
        l.add(null);
        System.out.println(l);

        
        
        
        ListIterator<Object> i=l.listIterator(l.size());
        for (;i.hasPrevious();) {
            System.out.println(i.previous());
        }

        Vector<Object> v = new Vector<>();
		v.add(10);
		v.add(50);
		v.add(100);
		v.add(54);
		v.add(86);
        System.out.println(v.capacity());
        v.removeElementAt(1);
        v.addElement(56);
        System.out.println("after removing: "+v);
    }
}
