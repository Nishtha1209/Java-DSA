package com.company;

public class FloorOfaNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(floor(arr, target));
    }

    //return the index number of greatest or equal to target number.
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end- start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target<arr[mid]){
                end = mid-1;
            }
            if(target>arr[mid]){
                start = mid + 1;
            }
        }
        return end;
    }
}
