import java.util.Scanner;
import java.math.BigInteger;

public class FactorialCalculator {
   
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

   
    public static BigInteger factorialRecursive(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorialRecursive(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factIter = factorialIterative(n);
            System.out.println("Iterative factorial of " + n + " is: " + factIter);

            BigInteger factRec = factorialRecursive(n);
            System.out.println("Recursive factorial of " + n + " is: " + factRec);
        }

        sc.close();
    }
}
