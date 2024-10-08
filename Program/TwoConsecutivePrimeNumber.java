public class TwoConsecutivePrimeNumber {
    static int divisble;
    public static void main(String[] args) {
        for(int i=20;i<=40;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j!=0){
                    divisble++;
                }
            // System.out.println(i);
            }
            if(divisble==2){ 
                System.out.println("First Prime Number is "+divisble);
            }
        }
    }
}
