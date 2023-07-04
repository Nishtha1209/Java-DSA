public class LeaderInArray {
    public static void LeaderinArray(int arr[], int n)
    {
        int i,j,k;

        for(i=0;i<n;i++){
            k=arr[i];

            for(j=i+1;j<n;j++){
                if(arr[j]>=k)
                    break;
            }

            if(j==n)
                System.out.print(k+" ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {15,19,5,3,4,2};
        int n = arr.length;
        LeaderinArray(arr, n);
    }
}

