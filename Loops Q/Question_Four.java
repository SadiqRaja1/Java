import java.util.*;
public class Question_Four {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);

        int number;
        int table;

        System.out.println("Enter your number : ");
        number = sc.nextInt();

        for (int i=1; i<=10; i++){
            table =number*i;
            System.out.println(number +"*"+i+ "="+ table);
        }
    }
}
