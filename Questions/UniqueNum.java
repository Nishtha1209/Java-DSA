//Cn be done by hashset in O(n) complexity
import java.util.*;

public class UniqueNum {
    public static boolean isUnique(int n){
        String s = Integer.toString(n);
        for (int i=0; i<s.length(); i++){
            for (int j=0; j+1<s.length(); j++){
                if(s.charAt(j)!=s.charAt(j+1)){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isUnique(n));
    }
}
