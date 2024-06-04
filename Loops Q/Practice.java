import java.util.Scanner;

public class Practice {
    
    public static void main (String args[]) {

        /* Q1 */
        // for(int i = 0; i<5; i++) {
        //     System.out.println("Hello");
        //     i+=2;
        // }

        /* Q2 */
        // Scanner sc = new Scanner(System.in);
        // int n ;
        // int SumEven = 0;
        // int SumOdd = 0;
        // int choice = 0;

        // do{
        //     System.out.print("Enter your number : ");
        //     n = sc.nextInt();
        //     if( n%2 == 0) {
        //         SumEven +=n;
        //     }
        //     else {
        //         SumOdd+=n;
        //     }
        //     System.out.print("Enter 1 to continue and 0 to stop : ");
        //     choice = sc.nextInt();
        
        // }while (choice == 1 );
        
        // System.out.println("Sum of even number is " + SumEven);
        // System.out.println("Sum of odd number is " + SumOdd);

        /* Q 3 */

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your number : ");
        // int  n = sc.nextInt();
        // int Factorial = 1;

        // for (int i=1; i<=n; i++){
        //     Factorial*=i;
        // }
        // System.out.println("Factorial of "+n+" = "+Factorial);
            

        /* Q4 */

    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();

    //     // for (int i=1; i<=10; i++) {
    //     //     System.out.println(n+" x "+i+" = "+n*i);
    //     // }

    //     int i = 1;
    //     do {
    //         System.out.println(n+" x "+i+" = "+n*i);
    //         i++;
    //     }while(i<=10);
    // }

    /* Q5 */

    for (int i = 0; i<=5; i++){
        System.out.println("i = " + i);
    }
    System.out.println("i after the loop = " + i);
    }
}
