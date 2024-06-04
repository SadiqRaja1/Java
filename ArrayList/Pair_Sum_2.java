import java.util.ArrayList;
public class Pair_Sum_2 {

public static boolean PairSum2(ArrayList<Integer> list, int target){ 
    int bp = -1;
    int n = list.size();
    for ( int i = 0; i<n; i++) {
        if (list.get(i) > list.get(i+1)) {
            bp = i;
            break;
        }
    }
    int lp = bp+1;
    int rp = bp;

    while(lp != rp){
    // Case 1
        if (list.get(lp) + list.get(rp) == target) {
            return true;
        }
        // case2
        if (list.get(lp) + list.get(rp) < target) {
            lp = (lp+1) % n;
        }else { // case 3
            rp = (n+rp-1) % n;
        }
    }
    return false;

}

    public  static void main(String args []){
        ArrayList<Integer> list = new ArrayList<>();
        // 1,2,3,4,5,6 - Sorted &Roated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        int target = 16;

        System.out.println(PairSum2(list, target));
        
    }
}
