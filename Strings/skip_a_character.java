package com.company;

import java.util.ArrayList;

public class skip_a_character {
    public static void main(String[] args) {
        String str = "abbac";
        skip(str);
        skip2(" ", "hgacgsad");
    }
    //Approach 1: create a ans variable in function body
       static void skip(String str){
        String ans=" ";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'){
                continue;
            }
           ans = ans + str.charAt(i);
        }
           System.out.println(ans);
       }

       //Approach 2: passing the string arguments in function
        static void skip2(String processed, String unprocessed){
            if(unprocessed.isEmpty()){
                System.out.println(processed);
                return;
            }
            char ch =  unprocessed.charAt(0);
            if(ch=='a'){
                skip2(processed, unprocessed.substring(1));
            } else{
                skip2(processed+ch, unprocessed.substring(1));
            }
        }
}
