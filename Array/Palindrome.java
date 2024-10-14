package Array;

public class Palindrome {
    public static void main(String[] args) {
        // int rev=0;
        int[] a = { 1, 2, 1, 2, 1 };
        int rev[] = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            rev[a.length - 1 - i] = a[i];
        }
        boolean flag = true;
        for (int j = 0; j < rev.length - 1; j++) {
            if (rev[j] != a[j]) {
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
