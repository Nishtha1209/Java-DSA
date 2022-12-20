package com.company;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i =0; i<26; i++){
            char ch = (char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);  //internally works similar to builder.toString();

        builder.deleteCharAt(1);  //many more properties
        System.out.println(builder);
    }
}
