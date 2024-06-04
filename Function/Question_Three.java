import java.util.*;
public class Question_Three {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int palindrome = sc.nextInt();
        
        if (ispalindrome(palindrome)) {
            System.out.println("The number "+palindrome +" is palindrome");

        }else{
            System.out.println("The number " +palindrome +" is not palindrome");
        }
    }

    public static boolean ispalindrome (int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome /= 10;
        }
        if (number == reverse) {
            return true;
        }else{
            return false;
        }
    }
}
