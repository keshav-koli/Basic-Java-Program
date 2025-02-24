package Pattern.EasyPattern;

import java.util.Scanner;

public class pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }

        sc.close();
    }
}
