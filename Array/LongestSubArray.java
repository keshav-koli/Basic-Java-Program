package Array;

public class LongestSubArray {
    public static int maxSubArray(int[] arr) {
        int maxCount = 1, tempL = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[j] > arr[j - 1]) {
                if (tempL == 0) {
                    maxCount++;
                    j++;
                } else {

                    tempL++;
                    maxCount = Math.max(maxCount, tempL);
                    j++;
                }
            } else {
                tempL = 1;
                j++;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 1, 5, 7, 9, 2, 3 };
        System.out.println(maxSubArray(arr));
    }
}
