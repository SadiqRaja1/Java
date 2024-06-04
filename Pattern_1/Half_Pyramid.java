import java.util.Scanner;
public class Half_Pyramid {
    public static void main(String args[]){
        System.out.println("Hi,How much lines you want to print?");
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        for (int line=1; line<=n; line++) {
            for(int star=1;star<=line; star++) {
                System.out.print(star);
            } System.out.println();
        }
    }
}
