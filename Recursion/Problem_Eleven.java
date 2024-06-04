public class Problem_Eleven {
    public static int TilligProblem(int n) {
        //base
        if (n == 0 || n == 1) {
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = TilligProblem(n-1);

        //horizontal choice
        int fnm2 = TilligProblem(n-2);

        int totWays = fnm1 +fnm2;
        return totWays;
    }
    public static void main (String args []) {
        System.out.println(TilligProblem(4));
    }
}
