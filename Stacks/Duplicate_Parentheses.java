import java.util.*;
public class Duplicate_Parentheses {
    public static boolean checkDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //closing
            if (ch ==')') {
                int count = 0;
                while(s.pop() !='(') {
                    count++;
                }
                if(count < 1) {
                    return true; // dulplicate
                }
            }else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        String str = "(a+b)";
        String str2 = "((a+b))";
        System.out.println(checkDuplicate(str));
        System.out.println(checkDuplicate(str2));
    }
}
/* for making code small remove some entry
if (ch ==')') {
                int count = 0;
                while(s.peek() !='(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; // dulplicate
                }else {
                    s.pop(); // opening pair
                }
            }else {
                // opening
                s.push(ch);
            } */

