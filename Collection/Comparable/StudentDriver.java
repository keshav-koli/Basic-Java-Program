package Collection.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1=new Student(11,"ram");
        Student s2=new Student(12,"shyam");
        Student s3=new Student(13,"ravi");
        Student s4=new Student(11,"ram");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));

        
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.sort(list);
        // Collections.reverse(list);
        System.out.println(list);
    }
}
