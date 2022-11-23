package com.company;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int arr[][]={
                {2,3,4},
                {5,6,7},
                {8,9,10}
        };
        int target = 7;
        int[] ans = linearSearch(arr, target); //FORMAT OF RETURN VALUE OF ROW, COL
//        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] linearSearch(int[][] arr, int target){
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(target==arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
