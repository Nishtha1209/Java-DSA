import java.util.*;
///TO BE DONEEE
public class NoOfCharactersInStr {
    static int count1=0;
    static int count2=0;
    static int count3=0;
    public static void showNum(String s){

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                count1+=1;
            } else if (s.charAt(i)=='b') {
                count2+=1;
            } else if (s.charAt(i)=='c') {
                count3+=1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.print("a"+count1+"b"+count2+"c"+count3);
    }
}
