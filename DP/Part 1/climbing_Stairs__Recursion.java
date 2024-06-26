public class climbing_Stairs__Recursion {
    // O(2^n)
    public static int countWays(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        return countWays(n-1) + countWays(n-2);
    }
    public static void main(String args []){
        int n = 5; // n=3 -> 3 ways & n=4 -> 5 ways   Total 8 ways
        System.out.println(countWays(n));
    }
}
