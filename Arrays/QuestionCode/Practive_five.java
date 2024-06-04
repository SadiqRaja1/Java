import java.util.*;
public class Practive_five {

    /* it's working but for correct answer check question_five.java */
    public static void find_triplet (int input[], int a) {
        if (input.length < 3) {
            System.out.println("Array is to small to form triplet");
        }

        for(int i=0; i<input.length; i++) {
            for (int j=i+1; j<input.length; j++) {
                for (int k = j+1; k<input.length; k++) {
                    int val = input[i]+input[j]+input[k];

                    if(val == a) {
                        int answer [] = new int[3];
                        answer[0] =input[i];
                        answer[1] =input[j];
                        answer[2] =input[k];

                        for(int m=0; m<answer.length; m++) {
                            System.out.print(answer[m]+ " ");
                        }
                        System.out.println();
                    }else {
                        continue;
                    }
                }
            }
        }
    }
    public static void main (String args[]) {
        int input [] = {-1, 0, 1, 2, -1, -4};
        int triplet_equals_to = 0;
        find_triplet(input, triplet_equals_to);

        int input1 [] = {1};
        find_triplet(input1, triplet_equals_to);

    }
}