package Collection.Set.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

//^ SortedSet is a child interface of Set. If we want to represent a group of individual objects according to some sorting order without duplicates then we should go for SortedSet.
//^ The main advantage of SortedSet is that we can get the elements in some sorted order.
//^ The underlying data structure is Red-Black tree.
//^ The important implementations of SortedSet are TreeSet, NavigableSet.
//^ TreeSet is the most commonly used implementation class of SortedSet.    
//^ TreeSet is the child class of Abstract
//^ TreeSet is the best choice if our frequent operation is retrieval operation.
//~ TreeSet is not synchronized.
// ~TreeSet is a class that implements the SortedSet interface. It is a collection of elements that are sorted in a natural order.
// ~TreeSet does not allow null elements. If you try to add a null element to a TreeSet, it will throw a NullPointerException.   
// ~TreeSet does not allow elements of different types. If you try to add elements of different types to a TreeSet, it will throw a ClassCastException.
public class first_sorted {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();
        
        // Adding elements to this set
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(40);
        set.add(-30);
        set.add((int)30.5); // ClassCastException
        // set.add(null);// NullPointerException
        System.out.println(set);// [-30, 10, 20, ,30, 40]
        

        // Methods of SortedSet
        System.out.println(set.first());// -30
        System.out.println(set.last());// 30
        System.out.println(set.headSet(20));// [-30, 10 ] lesser than 20
        System.out.println(set.tailSet(30));// [30,40] greater than or equal to 30
        System.out.println(set.subSet(10, 30));// [10, 20] greater than or equal to 10 and lesser than 30
        System.out.println(set.comparator());// null


    }
    
}
