import java.util.*;
public class SpecialNumber {
    //NAIVE APPROACH FOR TWO DIGIT NUMBERS
    public static boolean isSpecial(int n){
        int digitSum=0;
        int digitProduct=1;
        int x=n;
        int digit2 = x%10;
        x=x/10;
        int digit1 = x%10;
        digitSum = digit1+digit2;
        digitProduct = digit1*digit2;
        if(digitSum+digitProduct==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two digit number: ");
        int n = sc.nextInt();
        System.out.println(isSpecial(n));
    }
}
