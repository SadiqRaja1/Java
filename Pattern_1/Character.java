import java.util.Scanner;
public class Character {
    public static void main(String args[]){
        System.out.println("Hi,How much lines you want to print?");
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        char ch ='A';
        for (int line=1; line<=n; line++) {
            for(int chars=1;chars<=line; chars++) {
                System.out.print(ch);
                ch++;
            } System.out.println();
        }
    }
    
}
