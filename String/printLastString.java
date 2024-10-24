package String;

public class printLastString {
    public static void main(String[] args) {
        String s1 = "This is a Program";
        char[] s2 = new char[s1.length()];
        int s2Index = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            char ch = s1.charAt(i);
            if (s1.endsWith(" ")) {

            }
            if (ch != ' ') {
                s2[s2Index++] += ch;
            } else {
                break;
            }
        }
        char [] lastWord=new char[s2.length];
        for (int i = 0; i < s2Index; i++) {
            lastWord[i] = s2[s2Index - 1 - i];
        }
        String result = new String(lastWord);
        System.out.println(result);
    }
}
