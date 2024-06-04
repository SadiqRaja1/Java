import java.util.ArrayList;
import java.util.Collections;
public class Question_2 {
    public static ArrayList<Integer> findLonely (ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < nums.size()-1; i++) {
            if(nums.get(i-1)+1 < nums.get(i) && nums.get(i)+1 < nums.get(i+1)) {
                list.add(nums.get(i));
            }
        }
        if (nums.size() == 1){
            list.add(nums.get(0));
        }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size()-2)+1 < nums.get(nums.size()-1)) {
                list.add(nums.get(nums.size()-1));
            }
        }
        return list;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        list1.add(10);
        list1.add(6);
        list1.add(5);
        list1.add(8);

        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(3);

        System.out.println(findLonely(list1));
        System.out.println(findLonely(list2));
    }
}
