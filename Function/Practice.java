import java.util.*;
public class Practice {
    public static int Average (int i, int j, int k) {
        return (i+j+k)/3;
    }

    static boolean isEven (int n) {
        return n%2 == 0;
    }

    static boolean isPalindrome(int n ) {
        int palindrome = n;
        int reverse = 0;

        while (palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome /= 10;
        }
        return reverse == n;
    }

    public static int Sum_of_Digits (int a) {
        int sum = 0;

        while (a != 0) {
            int x = a%10;
            sum += x;
            a /= 10;
        }

        return sum;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        /*Q1 */
        // System.out.print("Enter your 1st number : ");
        // int i = sc.nextInt();
        // System.out.print("Enter your 2nd number : ");
        // int j = sc.nextInt();
        // System.out.print("Enter your 3rd number : ");
        // int k = sc.nextInt();
        // int average = Average(i , j , k );
        // System.out.print("The average of given number is : "+ average);

        /*Q2 */
        // System.out.print("Enter your number : ");
        // int n = sc.nextInt();
        // if(isEven(n)) {
        //     System.out.println(n+" is a Even number");
        // } else {
        //     System.out.println(n+" is a Odd number");
        // }
        // }

        /*Q3 */
        // System.out.print("Enter your number : ");
        // int n = sc.nextInt();
        // if(isPalindrome(n)) {
        //     System.out.println(n+ " is a palindrome number");

        // }else {
        //     System.out.println(n+ " is not a palindrome number");
        // }

        /*Q4 */

        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        
        System.out.println(Sum_of_Digits(a));

    }
}
