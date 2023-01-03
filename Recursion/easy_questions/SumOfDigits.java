package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(56));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum( n/10 )+ (n%10);
    }
}
