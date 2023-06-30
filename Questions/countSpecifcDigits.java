import java.util.ArrayList;
import java.util.List;

public class countSpecifcDigits {

    public static List<Integer> getNumbersWithDigits(int m, int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = m; i <= n; i++) {

            if (containsDigits(i, new int[]{1, 4, 9})) {
                result.add(i);
            }
        }

        return result;
    }

    private static boolean containsDigits(int number, int[] digits) {
        String numberString = String.valueOf(number);

        for (char digit : numberString.toCharArray()) {
            boolean found = false;
            for (int d : digits) {
                if (Character.getNumericValue(digit) == d) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int m = 100; // Starting number
        int n = 200; // Ending number

        List<Integer> numbersWithDigits = getNumbersWithDigits(m, n);

        System.out.println("Numbers between " + m + " and " + n + " containing digits 1, 4, and 9:");
        for (int number : numbersWithDigits) {
            System.out.println(number);
        }
    }
}
