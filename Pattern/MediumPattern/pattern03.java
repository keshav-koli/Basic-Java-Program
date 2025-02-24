package Pattern.MediumPattern;

import java.util.Scanner;

public class pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 1; k++) {
                System.out.print("*");
            }
            if (i != 1) {
                for (int l = 1; l < 2 * i - 2; l++) {
                    System.out.print(" ");
                }
                for (int m = 1; m < 2; m++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 1; k++) {
                System.out.print("*");
            }

            if (i != 3) {
                for (int m = n; m >= 2*i; m--) {
                    System.out.print(" ");
                }
                for (int m = 1; m < 2; m++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
