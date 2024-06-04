public class Compare {
    public static void main (String args[]) {
        String s1 ="tony";
        String s2 ="tony";
        String s3 =new String ("tony");
        if (s1 == s2) {
            System.out.println("Equal");
        }else {
            System.out.println("not Equal");
        }
        if (s1 == s3) {
            System.out.println("Equal");
        }else {
            System.out.println("not Equal");
        }
        if (s1.equals(s3)) {
            System.out.println("Equal");
        }else {
            System.out.println("not Equal");
        }
    }
}
