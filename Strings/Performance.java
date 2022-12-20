package com.company;

public class Performance {
    public static void main(String[] args) {
        String series = " ";
        for(int i = 0; i<26; i++){
            char ch = (char)('a'+i); //typecasting
//            System.out.println(ch);
            series += ch; //new objects is created everytime we add to the string because string are immutable --> wastage of space O(N^2).
        }
        System.out.println(series);
    }
}
