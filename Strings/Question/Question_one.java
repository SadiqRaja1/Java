import java.util.*;
public class Question_one {
    public static void main (String args[]) {
        String str = new Scanner(System.in).next();
        int cout =0;

        for (int i = 0 ; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                cout++;
            }
        }
        System.out.println("count of vowels is "+ cout);
    }
}
