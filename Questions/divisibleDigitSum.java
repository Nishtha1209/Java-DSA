import java.util.*;
public class divisibleDigitSum {

    public static boolean isDivisible(int n){
        int x = n;
        int sum=0;
        while(x%10!=0){
            int rem = x%10;
            sum +=rem;
            x=x/10;
        }
        if(n%sum==0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isDivisible(n));
    }
}
