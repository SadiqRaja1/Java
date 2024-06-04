import java.util.ArrayList;
// 2 Pointer Approach O(n)
public class Container_with_Most_Water_Optimized {

    public static int storeWater(ArrayList<Integer> Height) {
        int maxWater = 0;
        int lp = 0;
        int rp = Height.size()-1;

        while (lp <rp) {
            // calculate water area
            int ht = Math.min(Height.get(lp), Height.get(rp));
            int width = rp-lp;
            int CurrWater = ht * width;
            maxWater = Math.max(CurrWater, maxWater); 
            // update ptr
            if (lp<rp) {
                lp++;
            } else {
                rp--;
            }

        }
        return maxWater;
    }
    public static void main (String args[]) {
        ArrayList<Integer>Height= new ArrayList<>();

        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        System.out.println("The Maximum water can be Stored is " + storeWater(Height));
    }
}