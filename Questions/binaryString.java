import java.util.Scanner;

public class binaryString {
    public static void binaryRes(String s){
        int res = s.charAt(0) - '0';

        for(int i=1; i<s.length(); i++){
            char prev = s.charAt(i);
            int j = i+1;
            if(prev == 'A'){
                res = res & s.charAt(j) - '0';
            } else if (prev == 'B') {
                res = res | s.charAt(j)-'0';
            } else if (prev == 'C') {
                res = res ^ s.charAt(j)-'0';
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        binaryRes(s);
    }
}
