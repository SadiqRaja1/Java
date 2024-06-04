import java.util.*;

public class Sum_of_three {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Pen price : ");
        float Pen = sc.nextFloat();
        System.out.println("Enter Penccil price : ");
        float Pencil = sc.nextFloat();
        System.out.println("Enter Eraser price : ");
        float Eraser = sc.nextFloat();

        float sum = Pen+Pencil+Eraser;

        System.out.println("The Total Price is : "+sum);

        float GST=sum + sum*(18f/100f);
        
        System.out.println("The Total Price with GST is : "+GST);

    }
}
