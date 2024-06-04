import java.util.Scanner;

public class Practice {
    public static void main (String args[]) {

        /* 1 */
        // Scanner sc = new Scanner(System.in);
        // System.out.print("How much lines you want to print : ");
        // int n = sc.nextInt();
        // for(int i = 1; i<=n; i++) {
        //     for(int j=0; j<i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /* 2 */
        // Scanner sc = new Scanner(System.in);
        // System.out.print("How much lines you want to print : ");
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /* 3 */
        // Scanner sc = new Scanner(System.in);
        // System.out.print("How much line you want to print : ");
        // int n = sc.nextInt();
        // for (int i=1; i<=n; i++) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        /* 4 */
        Scanner sc = new Scanner(System.in);
        System.out.print("How much line you want to print : ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
