package com.company;

import java.util.ArrayList;

public class LSmultipleOccurences {
    public static void main(String[] args) {
        int[] arr = {3,2,3,4,5,6,7};
        int target = 3;
        search(arr,target,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static void search(int [] arr, int target, int index){
        if(arr[index]==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        search(arr,target,index+1);
    }
}
