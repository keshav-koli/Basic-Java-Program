// to print all the prime number 1 to 20
public class PrintPrimeNumber {
    public static void main(String arg[]) {
        int divisble = 0;
        for (int i = 1; i <= 20; i++) {
            for (int j = 0; j < i; j++) {

            }
            if (i % 2 == 0) {
                divisble++;
            }
        }
        if (divisble == 1) {
            for (int j = 1; j <= 0; j++) {
                System.out.println(j);
            }
        }
    }
}
