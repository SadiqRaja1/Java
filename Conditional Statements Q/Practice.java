import java.time.MonthDay;
import java.util.*;
public class Practice {
    public static void main (String args []){
        // Scanner sc = new Scanner (System.in);

        // int a = sc.nextInt();

        // if ( a >= 0){
        //     System.out.println("The given number " + a + " is positive");
        // }
        // else {
        //     System.out.println("the given number "+ a + " is negative");
        // }

        // boolean check = (a >= 0) ? true : false;

        // System.out.println("The given number is positive : "+ check);
         
        /* question 2 */

        // double temp = 103.5;

        // if (temp > 100) {
        //     System.out.println("You have fever");
        // }
        // else {
        //     System.out.println("You don't have fever");
        // }

        /*Question 3 */

        // Scanner sc = new Scanner (System.in);
        // int a = sc.nextInt();
        // switch (a) {
        //     case 1 :
        //     System.out.println("Monday");
        //     break;
            
        //     case 2 :
        //     System.out.println("Tuesday");
        //     break;

        //     case 3 :
        //     System.out.println("Wednesday");
        //     break;

        //     case 4 :
        //     System.out.println("Thursday");
        //     break;

        //     case 5 :
        //     System.out.println("Friday");
        //     break;

        //     case 6 :
        //     System.out.println("Saturday");
        //     break;

        //     case 7 :
        //     System.out.println("Sunday");
        //     break;

        //     default : 
        //     System.out.println("Plese enter the correct number");
        //     break;
        // }


        /* Question 4 */
    //     int a = 63, b = 36;

    //     boolean x = (a < b) ? true : false;
    //     int y = (a > b) ? a : b;

    //     System.out.println(x + "  " + y);
    // }

        /* Question 5 */ 
         
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();

        if (a % 4 == 0) {
            if (a % 100 != 0) {
                System.out.println("It's a Leap Year");
            }
            else if ( a % 400 == 0){
                System.out.println("It's a Leap Year");
            }
            else {
                System.out.println("It's not a Leap Year");
            }
        }
        else {
            System.out.println("It's not a Leap Year");
        }
    }
}
