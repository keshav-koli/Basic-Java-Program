package String;

public class reverseStringIntoCharacterArray {
    public static void main(String[] args) {

        // convert the string into character array then reverse it
        String s="hello";
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length - 1;
        char temp;
        while (i < j) {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reverse String using Character Array " + new String(ch));
    }
}
