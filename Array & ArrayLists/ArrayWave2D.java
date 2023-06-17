import java.util.*;

public class ArrayWave2D {

    public static void wave(int[][]nums, int row, int col){
        for(int i=0; i< col; i++){
            if(i%2==0){
                for(int j=0; j<row; j++){
                    System.out.print(nums[j][i]);
                }
            }
            else{
                for(int j = row-1; j>=0; j--){
                    System.out.print(nums[j][i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 3;
        int col = 3;
        int[][] nums = new int[row][col];
        System.out.println("Enter elements:");
        for (int i = 0; i < nums.length; i++) {
            for(int j=0;j<nums.length; j++ ){

                nums[i][j]=sc.nextInt();
            }
        }
        wave(nums,row, col);
    }
}
