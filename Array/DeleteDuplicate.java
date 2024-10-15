package Array;

public class DeleteDuplicate {
    public static void main(String[] args) {
        // int[] a = {1, 2, 4, 5, 2, 5};
        // int[] b = new int[a.length];
        // int bIndex = 0;

        // for (int i = 0; i < a.length; i++) {
        // boolean isDuplicate = false;
        // for (int j = 0; j < bIndex; j++) {
        // if (a[i] == b[j]) {
        // isDuplicate = true;
        // break;
        // }
        // }
        // if (!isDuplicate) {
        // b[bIndex++] = a[i];
        // }
        // }

        //// Print the array with unique elements
        // for (int i = 0; i < bIndex; i++) {
        // System.out.print(b[i] + " ");
        // }
        // }
        int[] a = { 1, 2, 3,5 ,4,1, 2, 2, 4 };
        int Duplicate = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && a[j] != Integer.MIN_VALUE) {
                    a[j] = Integer.MIN_VALUE;
                    Duplicate++;
                }
            }
        }
        int[] b = new int[a.length - Duplicate];
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            if (a[i] != Integer.MIN_VALUE) {
                b[j] = a[i];
                j++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

}