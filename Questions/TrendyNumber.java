import java.util.*;
public class TrendyNumber {
    static boolean isTrendy(int n){
       if(n>=100 && n<=999){
           int x = n;
           x = x/10;
           int rem = x%10;
           if(rem%3==0){
               return true;
           }else{
               return false;
           }
       }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number: ");
        int n = sc.nextInt();
        System.out.println(isTrendy(n));
    }
}
