import java.util.*;

public class NoOfHandshakes {
    public static int handshakes(int n){
        int count=0;

        for(int i=1; i<n; i++){
            count+=i;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of people: ");
        int n = sc.nextInt();
        System.out.println(handshakes(n));
    }
}
