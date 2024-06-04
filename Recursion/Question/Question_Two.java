public class Question_Two {
    static String digits[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static  void Num_Word(int number) {
        if (number == 0) {
            return;
        }
        int lastdigit = number%10;
        Num_Word(number/10);
        System.out.print(digits[lastdigit]+" ");
    }
    public static void main (String args[]) {
        Num_Word(854);
    }
}
