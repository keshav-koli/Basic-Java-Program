package ObjectClass.HashCode;

public class student {
    int sid;
    String sname;

    public student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
    public boolean  equals(Object o){
        student s=(student)o;
        return this.sname.equals(s.sname) && this.sid == s.sid;
    }
    public int hashCode(){
        return 5;
    }
    public static void main(String[] args) {
        student s1=new student(123,"ram");
        
    }
}
