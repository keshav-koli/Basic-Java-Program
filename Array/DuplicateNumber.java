package Array;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] a = { 1, 2, 1, 4, 5, 2 , 0, 9, 0, 9};

        for (int i = 0; i < a.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && a[j] != Integer.MIN_VALUE) {
                    count = 1;
                    a[j] = Integer.MIN_VALUE;
                }
            }
            if (count == 1) {
                System.out.println("Repeated Numbers are " + a[i]);
            }
        }
    }
}
