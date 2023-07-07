class diagonalString {
    static void patternX(String s, int n)
    {
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            for (int k = 0; k < n; k++) {
                if (k == i || k == j)
                    System.out.print(s.charAt(k));
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args)
    {
        String s = "Hello";
        int n = s.length();
        patternX(s, n);
    }
}


