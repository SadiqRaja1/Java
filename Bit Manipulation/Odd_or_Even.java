public class Odd_or_Even {
    public static void OddorEven(int n) {
        int bitmask =1;
        if ((n & bitmask)==0) {
            //even number
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    public static void main (String args[]) {
        OddorEven(3);
        OddorEven(4);
        OddorEven(7);
    }   
}
