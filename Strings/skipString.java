package com.company;

public class skipString {
    public static void main(String[] args) {
        System.out.println(skipApple("grandmalikesapplejuice"));
        System.out.println(skipAppNotApple("thisappisapple"));
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1)); //substring(index): string starting from index 1 in this case
        }
    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple((up.substring(5)));
        } else {
            return up.charAt(0) + skipAppNotApple((up.substring(1))); //substring(index): string starting from index 1 in this case
        }
    }
}