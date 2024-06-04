import java.util.Scanner;

public class Practice1 {
    public static void main (String arga[]){
        
        // Q1
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();

        // if (a >= 0) {
        //     System.out.println("Given number is Even");
        // }else {
        //     System.out.println("Given number is Oddn");
        // }

        //Q2
        // double temp = 103.5;

        // if (temp > 100) {
        //     System.out.println("You have fever");
        // } else {
        //     System.out.println("You don't have fever");
        // }

        //Q 3
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int a = sc.nextInt();
        // switch (a) {
        //     case 1:
        //         System.out.println("Sunday");
        //         break;
            
        //     case 2:
        //         System.out.println("Monday");
        //         break;  
                
        //     case 3:
        //         System.out.println("Tuesday");
        //         break;
            
        //     case 4:
        //         System.out.println("Wednesday");
        //         break;
            
        //     case 5:
        //         System.out.println("Thursday");
        //         break;

        //     case 6:
        //         System.out.println("Friday");
        //         break;

        //     case 7:
        //         System.out.println("Saturday");
        //         break;
        //     default:
        //         System.out.println("Please enter number between 1 to 7");
        //         break;
        // }

        // Q4

        // int a = 63, b = 36;
        // boolean x = (a < b) ? true : false;
        
        // int y = (a > b) ? a : b ;

        // System.out.println("Value of x = "+x+ " and value of y = "+ y);

        // Q5
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%4 == 0) {
            if (a%100 == 0) {
                if(a%400 == 0) {
                    System.out.println("This is Leap year");
                }else {
                    System.out.println("This is not an leap year");
                }
            }else {
                System.out.println("This is Leap year");
            }
        }else {
            System.out.println("This is not an leap year");
        }
       
    }
}
