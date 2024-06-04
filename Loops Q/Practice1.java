import java.util.*;

public class Practice1 {
    public static void main (String args[]) {
        /* Q1
        // for(int i=0; i<5; i++) {
        //     System.out.println("Hello");
        //     i+=2;
        //     System.out.println(i);
        // } */

        /* Q2 
        int odd [] = new int[10];
        int even [] = new int[10];
        int oddsum = 0, evensum = 0;
        Scanner sc = new Scanner(System.in);
        int a;
        int e = 0;
        int o = 0;
        int b;

        do{ a = sc.nextInt();
             if(a%2 == 0) {
            even [e]= a;
            e++;
            }else {
            odd[o] = a;
            o++;
            }
            System.out.print("Enter 0 to contineu or 1 to stop :");
            b = sc.nextInt();
        }while(b == 0);

        for(int i =0; i<odd.length; i++){
            oddsum += odd[i];
        }
        for(int i =0; i<even.length; i++){
            evensum += even[i];
        }
        System.out.println("Sum of even number is : "+ evensum + "\n" + "Sum of odd number : "+ oddsum );
        */

        /* Q3 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Factorial = 1;

        for (int i = 1; i<=n; i++) {
            Factorial *= i;
        }
        System.out.println("The factorial of "+ n +" is : "+ Factorial);
         */

        /* 
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter which table you want to print : ");
        int n = sc.nextInt();

        for(int i = 1; i<=10; i++) {
            System.out.println(n+ " X "+i+" = "+ n*i);
        }
        */

        for(int i = 0; i<= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("i after the loop = " + i);
        
    }
}
