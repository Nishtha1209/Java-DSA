package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class evenNumofDigitsInArray {
    public static void main(String[] args) {
        int[] arr = {34,5,666, 87,3345};

        //WRONG CODE THIS IS HAVE A LOOK AT IT AGAIN
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits%2 ==0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        int count=0;
           while(num>0){
               count++;
               num=num/10;
           }
            return -1;
        }

}
