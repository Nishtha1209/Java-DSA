//input a number n, till n check for prime numbers till n, if prime then print the factorial of those numbers;
import java.util.*;

public class PrimeNoFact {

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=n; i++){

            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void PrintFactorial(int n) {
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println("The factorial of prime number " + n + " is"+ fact(i));
            }
        }

    }
    private static int fact(int n) {
        if(n==0 && n==1){
            return 1;
        }
        int fact = n*fact(n-1);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=2; i<=n; i++){
            PrintFactorial(i);

        }
    }
}
