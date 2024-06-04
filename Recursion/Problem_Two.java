import java.util.*;
public class Problem_Two {
    public static void printInt(int n) {
        if (n==1) {
            System.out.print(n +" ");
            return;
        }
        printInt(n-1);
        System.out.print(n+ " ");
    }
    public static void main (String args[]) {
        System.out.println("Enter the digit : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printInt(a);
    }
}
