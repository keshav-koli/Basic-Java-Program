package Collection.Set.Hashset;


public class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public String toString() {
        return "name: " + name + ", rollno: " + rollno;
    }

    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.name == s.name && this.rollno == s.rollno;
    }

    public int hashCode() {
        return rollno + name.hashCode();
    }

}
