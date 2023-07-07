import java.util.Scanner;

public class patternInt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            String s;
            if(i%2!=0){
                System.out.println(Integer.toBinaryString(i));
            }

        }
    }
}

