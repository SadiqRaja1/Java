import java.util.*;
public class Question_one{
    public static void main(String args[]) {
        int input1 [] = {1,2,3,1};
        int input2 [] = {1,2,3,4};
        int input3 [] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println("Input1 is "+  checkduplicate(input1));
        System.out.println("Input1 is "+  checkduplicate(input2));
        System.out.println("Input1 is "+  checkduplicate(input3));
    }
    public static boolean checkduplicate(int num[]){   
        for (int i=0; i<num.length-1;i++){
            for (int j=i+1;j<num.length;j++){
                if (num [i]==num [j]) {
                    return true;
                }
            }
        }
        return false;
    }
}