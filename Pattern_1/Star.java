import java.util.*;
public class Star {
    public static void main(String args[]){
        System.out.println("Hi,How much lines you want to print?");
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        for (int line=0; line<=n-1; line++) {
            for(int star=0;star<=line; star++) {
                System.out.print("*");
            } System.out.println();
        }
    }
}
/* calculating time complexity
line - 1 to 4.....O(n)
star - 1 to line .....O(n)
0+1+2+3+4+5.....(n-1) AP (we can unerstand that TC is O(n raised to 2)
Or Line + star = O(n)+O(n)=O(nxn) =O (n raised to 2)
 */
