// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Nterms {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n];
        arr[0] = 6;
        arr[1] = 28;
        for(int i=2; i<n; i++){
            arr[i] = 16+(arr[i-1]-arr[i-2])+arr[i-1];
        }
        System.out.print(Arrays.toString(arr));
    }
};