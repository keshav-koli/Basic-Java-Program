package Array;
import java.util.Scanner;
public class SecondElement {
    public static void main(String[] args) {
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int SecondElement=arr[0];
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                SecondElement=max;
                max=arr[i];
            }
            else if(SecondElement<arr[i]){
                    SecondElement=arr[i];
            }
        }
        System.out.println("Second Maximum Number is "+ SecondElement);
        sc.close();
    }
}
