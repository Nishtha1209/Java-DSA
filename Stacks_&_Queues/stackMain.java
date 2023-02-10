package com.company;

public class stackMain {
    public static void main(String[] args) throws stackException {
        customStack stack = new customStack(5);
        stack.push(23);
        stack.push(42);
        stack.push(11);
        stack.push(27);
        stack.push(76);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
