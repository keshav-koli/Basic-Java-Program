package Collection.Comparable;

public class Student implements Comparable<Student> {
    public int rollno;
    public String name;
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + "]";
    }
    @Override
    public int hashCode() {
        return rollno;
    }
    @Override
    public boolean equals(Object obj) {
        Student s=(Student)obj;
        if(this.rollno==s.rollno) {
            return true;
        }
        return false;
    }
    // @Override
    //To compare the student objects based on rollno
    //override compareTo method of Comparable interface and write logic to compare the student objects based on rollno
    public int compareTo(Student s) {
        if(this.rollno==s.rollno) {
            return 0;
        } else if(this.rollno>s.rollno) {
            return 1;
        } else {
            return -1;
        }
        // Or
        // return this.rollno-s.rollno;
    }
    
}
