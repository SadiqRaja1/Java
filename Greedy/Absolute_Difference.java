import java.util.*;
public class Absolute_Difference {
    public static int MinAbsDiff(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);

        int MinSum = 0;
        for(int i = 0; i <a.length; i++) {
            int AbsDiff = Math.abs(a[i]-b[i]); // MinSum += Math.abs(a[i]-b[i]);
            MinSum += AbsDiff;
        }
        return MinSum;
    }
    public static void main(String args[])    {
        int A[] = {1, 2, 3};
        int B[] = {2, 1, 3};

        int C[] = {4, 1, 8, 7};
        int D[] = {2, 3, 6, 5};
        System.out.println("The absolute minimum differens of A & B is " +MinAbsDiff(A, B));

        System.out.println("The absolute minimum differens of C & D is " +MinAbsDiff(C, D));
    }
}
