package com.company;

import javax.xml.transform.stax.StAXResult;
import java.util.ArrayList;

public class returning_ArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8};
        int target = 4;
        ArrayList<Integer> ans = findIndex(arr, target,0,new ArrayList<Integer>());
        System.out.println(ans);
    }

    static ArrayList<Integer> findIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findIndex(arr,target,index+1,list);
    }
    //not optimised, not recommended
//    static ArrayList<Integer> search(int [] arr, int target, int index){
//        ArrayList<Integer> list = new ArrayList<>(); //new object(list) will be created on every function call;
//        if(arr[index]==arr.length){
//            return list;
//        }
//        //this will contain answer for that function call only
//        if(arr[index]==target){
//            list.add(index);
//        }
//        ArrayList<Integer> fromBelowCalls = search(arr,target,index+1);
//        list.addAll(fromBelowCalls);
//        return list;
//        //list return ans combined of all the function calls waiting in stack for last function call. to ave calls
//    }
}
