package com.company;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23,5,77,53,31,22};
//        int target = 1;
//        System.out.println(linearSearch(arr,target,2, arr.length));
        System.out.println(min(arr));
    }

//    static int linearSearch(int[] arr, int target, int start, int end){
//        if(arr.length==0){
//            return -1;
//        }
//        for (int index = start; index<=end; index++){
//            if(target==arr[index]){
//                return index;
//            }
//        }
//        return -1;
//    }

    //Printing minimum number in the array
    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
