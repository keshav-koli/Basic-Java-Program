package Pattern.MediumPattern;

import java.util.Scanner;

public class pattern02 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=i-1;k>0;k--){
                System.out.print(k);
            }
            System.out.println();
        }
     sc.close();   
    }
    
}
