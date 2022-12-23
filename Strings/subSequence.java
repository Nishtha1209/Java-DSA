//subsequence - strings
package com.company;

import java.util.ArrayList;

public class subSequence {
    public static void main(String[] args) {
        subseq("","abc");
        System.out.println(subseq2("", "def"));
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq( p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }
    static ArrayList<String> subseq2(String p, String up){  //return in the form of arraylist
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq2(p+ch, up.substring(1));
        ArrayList<String> right = subseq2(p, up.substring(1));
        left.addAll(right);
        return left;
    }
    //TO RETURN THE ASCII VALUES
    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p+ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p+(ch+0), up.substring(1));
    } //YOU CAN CREATE 3 ARRAYLISTS AND ADD THEM ALL TO RETURN ASCII
   
}
