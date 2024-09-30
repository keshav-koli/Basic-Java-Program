package Abstraction;

public abstract class Bank {
    double bal;

    public abstract void checkBal();

    public abstract void Withdraw(double amount);

    public abstract void Deposit(double amount);

}

class bankDriver extends Bank {
    double bal = 1000;
    public void checkBal() {
        System.out.println("Your balance is: " + bal);
    }

    public void Withdraw(double amount) {
        bal -= amount;
        System.out.println("You have withdrawn: " + amount);
    }

    public void Deposit(double amount) {
        bal += amount;
        System.out.println("You have deposited: " + amount);
    }
}