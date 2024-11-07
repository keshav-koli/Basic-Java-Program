package Collection;
import  java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class testLaptop {
    public static void main(String[] args) {
        Collection <laptopCollection> laptops = new ArrayList<laptopCollection>();
        laptops.add(new laptopCollection("Lenovo",49000,15));
        laptops.add(new laptopCollection("HP",39000,17));
        laptops.add(new laptopCollection("Dell",89000,41));
        laptops.add(new laptopCollection("Samsung",59000,21));

        Iterator <laptopCollection>i1=laptops.iterator();
        while(i1.hasNext()){
            laptopCollection l=i1.next();
            if(l.price>=50000){
                l.quantity+=1;
            }
            System.out.println(l);
        }

    }
}
