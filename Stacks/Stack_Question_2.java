import java.util.*;
public class Stack_Question_2 {
    public static void main(String args[]) {
        String str = "abc";

        Stack<Character> s = new Stack<>();
        
        int i=0;
        while(i<str.length()) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            result.append(s.pop());
        }
        str = result.toString();
        System.out.println(str);
    }
}
