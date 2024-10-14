package Array;

public class DeleteDuplicate {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 2, 5};
        int[] b = new int[a.length];
        int bIndex = 0;
        
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < bIndex; j++) {
                if (a[i] == b[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                b[bIndex++] = a[i];
            }
        }
        
        // Print the array with unique elements
        for (int i = 0; i < bIndex; i++) {
            System.out.print(b[i] + " ");
        }
    }
}