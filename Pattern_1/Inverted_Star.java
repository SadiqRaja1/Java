import java.util.*;
public class Inverted_Star {
    public static void main(String args[]) {
        System.out.println("Hi,How much lines you want to print?");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            } System.out.println();
        }
    }
}