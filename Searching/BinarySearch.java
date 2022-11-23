package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,9,22,35,78,90,109};
        int target = 35;
        System.out.println(Search(arr, target));
    }
    static int Search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            //find the middle element
            int mid = start+(end - start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else if(target== arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}
