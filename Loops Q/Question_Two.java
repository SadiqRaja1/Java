import java.util.*;
public class Question_Two {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

       do { System.out.println("Enter a number :");
        number = sc.nextInt();
        
        if ( number % 2 == 0){
            evenSum += number;
        }else {
            oddSum += number;
        }

        System.out.println("Enter Your choice 1 to continue 0 to stop :");
        
        choice = sc.nextInt();

        }while (choice == 1);
        
           System.out.println( "Sum of even number : "+ evenSum);
           System.out.println("Sum of odd number : "+ oddSum);
        }
}
