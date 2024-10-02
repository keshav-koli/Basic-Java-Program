package Polymorphism.CompileTimePolymorhism.Question;

public class Account {
    private int accountNumber;
    private int accountHolder;
    private int balance;

    public void  set_Account(int accountHolder,int accountNumber,int balance) {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public int get_holder(){
        return accountHolder;
    }
    public int get_number(){
        return accountNumber;
    }
    public int get_balance(){
        return balance;
    }
}

