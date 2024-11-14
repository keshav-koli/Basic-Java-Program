package Collection.SortedSet.TreeSet;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Character> set = new TreeSet<>();
        set.add('v');
        set.add('o');
        set.add('a');
        set.add('z');
        set.add('A');
        System.out.println(set);


        //  use methods of SortedSet here
        System.out.println(set.tailSet('o'));
		System.out.println(set.last());
		System.out.println("--------------------------------------------");
		
		// To traverse it 
		Iterator<Character> i = set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
    }
}
