package com.company;

import java.util.Arrays;
import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Nishtha Kaigaonkar";
        System.out.println(Arrays.toString((name.toCharArray())));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('i'));
        System.out.println("       Nishtha  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
