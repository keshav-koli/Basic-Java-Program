package Array;

/**
 * SumOfNumber
 */
public class SumOfNumber {
    public static void main(String[] args) {
        double  [] arr={1,2,4,5,6};
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of number is "+sum);
        System.out.println("Sum of number is "+sum/arr.length);
    }
    
}