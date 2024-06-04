import java.util.*;

public class Question_one {
    public static void main (String args[]) {  
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter 1st Number");
    int a = sc.nextInt();

    System.out.println("enter 2st Number");
    int b = sc.nextInt();

    System.out.println("enter 3st Number");
    int c = sc.nextInt();

    System.out.println("The average of three number is : "+ Average(a,b,c));

    }
    public static int Average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

}
