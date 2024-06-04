import java.util.*;
public class Question_five {
    public static void main (String args [] ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();

        System.out.println("The sum is "+sumDigit(a));
    }
    public static int sumDigit(int x) {
        int sumDigit = 0;
        

        while(x > 0) {
            int lastDigit = x % 10;
            sumDigit += lastDigit;
            x/=10;
        }

        return sumDigit;
    }
}   
