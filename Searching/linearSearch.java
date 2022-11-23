package com.company;

public class linearSearch {
    public static void main(String[] args) {
//        int[] arr = {6,9,88,12,3,5,7};
//        int target = 12;
//        System.out.println(linearSearch(arr, target));
        String str = "Nishtha";
        char target = 't';
        System.out.println(search(str, target));
    }
//    static int linearSearch(int[] arr, int target){
//        if(arr.length==0){
//            return -1;
//        }
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i]==target){
//                return i;
//            }
//        }
//        return -1;
//    }

    //for searching in string
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }                         //TO APPLY FOR EACH LOOP, CONVERT STRING TO ARRAY
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i)==target) {
                return true;
            }
        }
        return false;
    }
}
