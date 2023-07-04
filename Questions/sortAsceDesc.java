import java.util.*;

public class sortAsceDesc {
        static void printArr(int[] arr, int n)
        {
            Arrays.sort(arr);

            for (int i = 0; i < n / 2; i++) //incrementing loop to print in ascending order
                System.out.print(arr[i]+" ");

            for (int j = n - 1; j >= n / 2; j--) //decrementing loop to print in descending order
                System.out.print(arr[j]+" ");
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printArr(arr,n);
    }
}
