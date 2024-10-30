package Exception;

public class NestedTry {
    public static void main(String[] args) {
        char ch[]={'a','e','i','o','u'};
    try{
        for (int i = 0; i <= ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
        finally{
            System.out.println("end of the program");
        }
    }
}
