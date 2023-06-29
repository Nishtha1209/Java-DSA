import java.util.*;
public class removeHyphens {
    public static void remove(String s){
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='-'){
                ans+=s.charAt(i);
            }
        }
        for (int j=0; j<s.length(); j++){
            if(s.charAt(j)!='-'){
                ans+=s.charAt(j);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        remove(s);
    }
}
