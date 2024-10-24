package String;

public class StringIntoLowerCase {
    public static void main(String[] args) {
        String s1="HelloWorld";
        char [] s2=new char[s1.length()];
        // StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char ch=s1.charAt(i);
            if(ch>='A'&& ch<='Z'){
                s2[i]+=(char)(ch+32);
            }
            else{
                s2[i]+=ch;
            }
        }
        String result=new String(s2);
        System.out.println(result);
         
        
    } 
}
