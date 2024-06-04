import java.util.ArrayList;
public class Pair_Sum_1_Optimized {
    
    // 2 Ponter approach )(n)
    public static boolean Pointer_PairSum(ArrayList<Integer> list, int target){
        int lp = 0; 
        int rp = list.size()-1;

        while (lp != rp) {
            if (list.get(lp)+ list.get(rp) == target) { // case 1
                return true;
            }
            if(list.get(lp) + list.get(rp) < target) { // case 2
                lp++;
            }else { //case 3
                rp--;
            }
        }
        return false;

    }
    public  static void main(String args []){
        ArrayList<Integer> list = new ArrayList<>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        int target = 5;

        System.out.println(Pointer_PairSum(list, target));

    }
}
