import java.util.*;
public class climbing_Stairs__Tabulation_DP {

    // O(n)
    public static int countWaysTabulation(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;

        //tabulation loop
        for(int i = 1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i-1] + 0;
            }else{
                dp[i] = dp[i-1] + dp[i-2] ;
            }
        }
        return dp[n];
    }
    public static void main(String args []){
        int n = 5; // n=3 -> 3 ways & n=4 -> 5 ways   Total 8 ways

        System.out.println(countWaysTabulation(n));
    }
}