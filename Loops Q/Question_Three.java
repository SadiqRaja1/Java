import java.util.*;
public class Question_Three {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);

        int number;
        int fact = 1 ;

        System.out.println("Enter positive integer : ");
        number = sc.nextInt();
        for (int i =1; i<=number; i++) {
            fact *= i ;
        }
        System.out.println("Factorial is : "+ fact);


    }
}
