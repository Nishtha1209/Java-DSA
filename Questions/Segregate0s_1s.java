//Write a program to segeregate all the 0s in left side and all the 1s in right side of the same array
//import java.util.*;
//
//public class separate0s_1s {
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr= {0,1,0,0,1,1,0,1,0,1};
////        Arrays.sort(arr);
////        System.out.println(Arrays.toString(arr));
//
//
//    }
//}
// Java code to Segregate 0s and 1s in an array

// Importing generic libraries
// Importing Array libraries


public class Segregate0s_1s {

    static void segregate0and1(int arr[], int n)
    {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }

        for (int i = 0; i < count; i++)
            arr[i] = 0;

        // Loop fills the remaining values with 1
        for (int i = count; i < n; i++)
            arr[i] = 1;
    }

    static void print(int arr[], int n)
    {
        System.out.print("Array after segregation is: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        int arr[] = new int[] { 0, 1, 0, 1, 1, 1 };
        int n = arr.length;
        segregate0and1(arr, n);
        print(arr, n);
    }
}
