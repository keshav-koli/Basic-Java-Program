package Array;

public class MaxSumOfTwoNumber {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,2,9,8};
        int sum=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]>sum){
                    sum=arr[i]+arr[j];
                }
            }
        }
        System.out.println("Sum of two number is "+sum);
    }
    
}
