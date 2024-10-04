package Polymorphism.CompileTimePolymorphism.QuestionBasedOnPolymorphism;


public class Current extends Account {
    private int accountNumber;
    private int accountHolder;
    private int balance;
    public void set_Account(int accountHolder,int accountNumber,int balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public int get_balance(){
        return accountHolder;
    }
    public void display(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}

