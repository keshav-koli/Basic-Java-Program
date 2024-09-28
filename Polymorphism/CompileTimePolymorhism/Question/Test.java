package Polymorphism.CompileTimePolymorhism.Question;

public class Test {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.set_Account(41, 450, 0);
        System.out.println(ac.get_number());

        Account as=new Saving();
        Saving AS=(Saving)as;
        AS.set_Account(42000, 0, 0);
        System.out.println(AS.get_holder());
    }
}
