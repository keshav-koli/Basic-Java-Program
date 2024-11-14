package Collection.Hashset;

import java.util.HashSet;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        Set<Student> hs=new HashSet<>();
        Student s1=new Student(11,"ram");
        Student s2=new Student(12,"shyam");
        Student s3=new Student(13,"ravi");
        Student s4=new Student(11,"ram");
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        System.out.println(hs);
    }
}
