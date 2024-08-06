public class PrimeNumber {
    public static void main(String arg[]) {
        int n = 26;
        int divisble=0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisble++;
            }
        }
        if(divisble==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not A Prime Number");

        }
    }
}
