package com.company;

import com.sun.jdi.connect.Connector;

public class linearSearch_Recursion {
    public static void main(String[] args){
        int[] arr = {3,2,1,18,9};
        int target = 18;
        System.out.println(linear(arr,target,0));
    }
    //OPTIMIZED SOLUTION
    static boolean linear(int[] arr, int target, int index){
        if(arr[index]==arr.length || arr[index]!=target){
            return false;
        }
        return arr[index]==target || linear(arr,target,index+1);
    }

//    static int linear(int[] arr, int index){
//        int target = 18;
//        if(index == arr.length-1){
//            return index;
//        }
//        if(arr[index]==target){
//            return index;
//        }
//        return linear(arr,index+1);
//    }
}
