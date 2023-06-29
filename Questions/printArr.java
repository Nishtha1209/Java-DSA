import java.util.Arrays;
import java.util.Scanner;

public class printArr {

    public static void Print(int[] arr, int n){
        Arrays.sort(arr);
        int start=0;
        int end= arr.length-1;
        while(start<end){
            System.out.print(arr[start]+", "+arr[end]);
            System.out.println();
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Print(arr,n);
    }
}
