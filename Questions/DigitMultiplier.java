import java.util.Stack;
public class DigitMultiplier {

    static long smallestNum(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        Stack<Integer> Numdigits = new Stack<>();

        for (int i = 9; i >= 2 && n > 1; i--) {
            while (n % i == 0) {
                n = n / i;
            }
        }

        if (n != 1) {
            return -1;
        }
        long k = 0;
        while (!Numdigits.empty()) {
            k = k * 10 + Numdigits.peek();
            Numdigits.pop();
        }
        return k;
    }

    static public void main(String[] args) {
        int n = 100;
        System.out.println(smallestNum(n));
    }
}

