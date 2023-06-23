import java.util.*;

public class NoOfCharacters {

    public static void characters(String s) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int count = s.charAt(i) - '0'; // Convert the digit char to an integer
                if (i > 0) {
                    char prevChar = s.charAt(i - 1);
                    for (int j = 0; j < count; j++) {
                        st.append(prevChar);
                    }
                }
            }
        }
        System.out.println(st.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.next();
        characters(s);
    }
}
