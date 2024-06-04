public class Grid_Ways_Formula {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        // int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }

    public static void main (String args []) {
        int n = 3, m = 3;
        int T = fact((n-1 + m-2))/fact(n-1)*fact(m-1);
        System.out.println(T);

    }
}
