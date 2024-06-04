public class Problem_Ten {
    public static int Opower (int a, int n){
        if ( n==0) {
            return 1;
        }
        int halfpower = Opower(a, n/2);
        int halfpowwersq =  halfpower * halfpower;

        // n is odd
        if (n % 2!=0) {
            halfpowwersq = a * halfpowwersq;
        }
        return halfpowwersq;
    }
    public static void main (String args [] ) {
        System.out.println(Opower(2, 5));
    }
}
