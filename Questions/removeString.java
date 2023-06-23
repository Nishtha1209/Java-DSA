///FIRSE KRNA HAIII

import java.util.Scanner;
import java.util.Stack;

public class removeString {

    public static void remove(String s1, String s2){
        Stack<Character> st = new Stack<>();
        String ans = " ";
        for(int i = 0; i<s1.length(); i++){
            st.push(s1.charAt(i));
            }
        for(int j=s2.length()-1; j>=0; j--){
            if(st.peek()==s2.charAt(j)){
               st.pop();

            }
        }
        System.out.print(st);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String s1 = sc.next();
        System.out.println("Enter string s2: ");
        String s2 = sc.next();
        remove(s1, s2);
    }
}
