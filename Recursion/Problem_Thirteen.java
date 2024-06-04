public class Problem_Thirteen {
    public static int Fpair(int n) {
        if (n == 1 || n == 2){
            return n;
        }
        // //Choice
        // //Single
        // int fnm1 = Fpair(n-1);

        // //Pair
        // int fnm2 = Fpair(n-2);
        // int pairWays = (n-1) * fnm2;

        // //totWays
        // int totWays = fnm1 + pairWays;
        // return totWays;
        return Fpair(n-1) + (n-1) * Fpair(n-2);
    }

    public static void main (String args []) {
        System.out.println(Fpair(3));
    }
}
