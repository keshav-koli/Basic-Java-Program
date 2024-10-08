package method;
public class b {
    static void m1(){
        System.out.println("m1");
    }
    static float a=10.5f;
    static void m2(){
        m1();
        System.out.println(a);
        System.out.println(b.a);
        b.m1();
        System.out.println("m2");
    }
    
}
class c{
    static int a;
        public static void main(String arg[]){
            b.m1();
            b.m2();
            b.a=10;
            System.out.println(a);
        System.out.println(b.a);
        System.out.println(c.a);
        }
}