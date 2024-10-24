package Exception;

public class arithmeticException {
    public static void main(String[] args) {
        System.out.println("Performing an operation on int");
        int a = 88, b = 0;
        int c=0;
        try {
            c = a / b;

        } catch (RuntimeException o) {
            System.out.println("don't divide it by zero");
        }
        System.out.println(c);
        System.out.println("got the anwser");
        System.out.println("program ends after catch block");
    }
}
