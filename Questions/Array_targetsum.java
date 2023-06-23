import java.util.*;

public class Array_targetsum {
    public static boolean sum(int[] arr, int target){
        for(int j=0; j<arr.length; j++){
            for(int i=j+1; i<arr.length; i++){
                if(arr[i]+arr[j]==target){
                    System.out.print(i-1+","+j);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,5,7,8};
        int target = 9;
        System.out.println(sum(arr, target));
    }
}
