package Collection.linkedList;

import java.util.LinkedList;

public class first {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<>();
        l.add("null");
        l.add("45");
        l.add("85");
        l.add(new String("hello"));
        System.out.println(l);


        // method's of LinkedList
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.remove());
        System.out.println(l.removeAll(l));
        System.out.println("after removing"+l);

        // access its element
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }

}
// create a linked list and store the object sid,sname,smarks ,you have to remove the student ,who is getting highest marks 
