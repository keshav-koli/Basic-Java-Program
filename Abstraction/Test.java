package Abstraction;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new bankDriver();
        boolean isTrue = true;
        do{
            System.out.println("Enter 1 to check balance");
            System.out.println("Enter 2 to withdraw money");
            System.out.println("Enter 3 to deposit money");
            System.out.println("Enter 4 to exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    b.checkBal();
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    double amount = sc.nextDouble();
                    b.Withdraw(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount to deposit");
                    double amount1 = sc.nextDouble();
                    b.Deposit(amount1);
                    break;
                case 4:
                    isTrue = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        while(isTrue);
        sc.close();
    }
}