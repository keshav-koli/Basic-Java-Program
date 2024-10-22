package String;
public class SumNumInString {
    public static void main(String[] args) {

        String s = "as4158sd2s5";
        int i = 0;
        int sum=0;
        while (i < s.length()) {
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                sum+=ch-'0';
            }
            i++;
        }
        System.out.println("Sum of AlphaNumeric is "+sum);
    }
}
