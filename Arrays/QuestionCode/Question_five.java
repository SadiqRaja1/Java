import java.util.*;
public class Question_five {
    public static void main(String args[]) {
        int input []= {-1,0,1,2,-1,-4};
        int input0 []= {};
        int input1 []= {0};

        System.out.println(threeSum(input));
        System.out.println(threeSum(input0));
        System.out.println(threeSum(input1));


    }
    public static List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList <List<Integer>> ();
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++)  {
                for (int k=j+1; k<nums.length;k++) {
                    if (nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = new ArrayList < Integer > ();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);

                    }
                }
            }
        }
        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
        return result;
    }
}
