import java.util.*;
public class climbing_Stairs__Memoization_DP {
    //memoization O(n)   | recursion O(2^n)
    public static int countWays(int n, int ways[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(ways[n] != -1){ // already calculated
            return ways[n];
        }
        ways[n] = countWays(n-1, ways) + countWays(n-2, ways);
        return ways[n];
    }
    public static void main(String args []){
        int n = 5; // n=3 -> 3 ways & n=4 -> 5 ways   Total 8 ways
        int ways[] = new int[n+1]; // 0 , 0 , 0 by defaut 0 will be stored
        Arrays.fill(ways, -1); // -1 -1 -1 now -1 will be filled we can do this by loop also

        System.out.println(countWays(n, ways));
    }
}