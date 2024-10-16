package String;

class student {
    public static void main(String[] args) {
        String s1=new String("James");
        String s2="James";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3=new String("james");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        String s4=new String("");
        String s5="";
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));
    }
    
}