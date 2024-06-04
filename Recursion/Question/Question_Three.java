public class Question_Three {
    public static int Length_of_String(String str){
        if (str.length() == 0) {
            return 0;
        } 
        return Length_of_String(str.substring(1))+1;
    }
    public static void main (String args[]){
        String str = "abcdef";
        System.out.println(Length_of_String(str));
    }
}
