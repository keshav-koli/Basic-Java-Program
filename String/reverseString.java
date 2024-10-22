package String;

public class reverseString {
    public static void main(String[] args) {
        String s="hello";
        String rev="";
        // without the hel
        for (int i = s.length()-1; i >=0; i--) {
            rev=rev+s.charAt(i);
        }
        System.out.println("Reverse string is "+rev);
        // With the help of built in method
        StringBuilder s1=new StringBuilder(s);
        System.out.println("Reverse using method "+s1.reverse());
        
    } 

}
