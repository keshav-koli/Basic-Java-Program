package Pattern.EasyPattern;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
     sc.close();   
    }
    
}
