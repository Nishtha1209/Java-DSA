package com.company;

public class arrays {
    public static void main(String[] args){
        //int []marks = new int[5];
//        marks[0]=100;
//        marks[1]=90;
//        marks[2]=80;
//        marks[3]=70;
//        marks[4]=60;
//        System.out.println(marks[2]);

        int []marks = {10,9,8,9,9,10}; //declaration+initialize
        //float []marks = {99.7f,78.0f,76.0f,99.99f};
        //String []students = {"Bhoomi", "Atharva", "Buntea", "kaustubh", "Ishu"};
        //System.out.println(marks.length);

        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]); //array traversal
        }

        //decrementing for loop
        System.out.println("Using decremental for loop:");
        for (int i = marks.length-1; i>=0; i--){

            System.out.println(marks[i]);
        }
        //for each loop
        for (int element : marks){
            System.out.println(element);
        }
    }
}
