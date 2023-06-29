public class EquilibriumPoint {

    //Complexity -- O(n)
    public static int findEquilibriumPoint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int ls = leftSum(arr, 0, i - 1);
            int rs = rightSum(arr, i + 1, arr.length - 1);
            if (ls == rs) {
                return i;
            }
        }
        return -1; // Return -1 if no equilibrium point is found
    }

    public static int leftSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int rightSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }


    //Using total sum approach -- complexity o(n);
//    public static int eqPoint(int[] arr){
//        int arrSum=0;
//        for(int i=0; i<arr.length; i++){
//            arrSum+=arr[i];
//        }
//        for (int j=0; j<arr.length; j++){
//            if(a)
//        }
//
//        return -1;
//    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 8, 5, -4, 1};
        System.out.println(findEquilibriumPoint(arr));
    }
}
