package Polymorphism.CompileTimePolymorhism.Question;


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
}

