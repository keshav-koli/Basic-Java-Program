package Pattern.EasyPattern;

import java.util.Scanner;

public class pattern09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k=k+1;
            }
            System.out.println();
        }
     sc.close();   
    }
    
}
