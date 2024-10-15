package ObjectClass.HashCode;

public class student {
    int sid;
    String Sname;

    public student(int sid, String sname) {
        this.sid = sid;
        Sname = sname;
    }
    public boolean  equals(Object o){
        student s=(student)o;
        return this.sname=s.sname && this.sid=s.sid;
    }
    public int hashCode(){
        return 
    }
    public static void main(String[] args) {
        Student s1=new Student(123,'ram');
    }
}
