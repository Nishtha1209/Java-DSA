import java.util.*;
import java.lang.Math;
public class LargestPowerOfPrime {

    static int k=1;

    //factorial function is not useful
//    public static int factorial(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//        int factorial = n*factorial(n-1);
//        return factorial;
//    }
    public static int LargestPower(int n, int prime){
//        while(k<n){
//            if((factorial(n)%Math.pow(prime,k))==0){
//                k++;
//            }
//        }
//        return k-1;
        int power = 0;
        while (n > 0) {
            n /= prime;
            power += n;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter prime; ");
        int prime = sc.nextInt();
        int res= LargestPower(n,prime);
        System.out.println(res);
    }
}
