public class TwoConsecutivePrimeNumber {
    public static void main(String[] args) {
        int previousPrime = 0; // Variable to store the previous prime number
        
        // Loop through numbers from 20 to 40
        for (int i = 20; i <= 40; i++) {
            int divisible = 0;

            // Check if the current number is prime
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisible++;
                }
            }
            // If the number is prime (divisible by only 1 and itself)
            if (divisible == 2) {
                if (previousPrime != 0) {
                    // Print the multiplication of two consecutive prime numbers
                    System.out.println("First Prime Number: " + previousPrime);
                    System.out.println("Second Prime Number: " + i);
                    System.out.println("Multiplication: " + (previousPrime * i));
                    break; // Stop after finding the first pair of consecutive primes
                }
                previousPrime = i; // Store the current prime to compare with the next
            }
        }
    }
}
