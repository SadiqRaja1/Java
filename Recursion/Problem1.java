import java.util.*;
public class Problem1 {
    public static void printDec(int n) {
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main (String args[]) {
        System.out.println("Enter the digit : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printDec(a);
    }
}
