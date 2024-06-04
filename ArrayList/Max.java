import java.util.ArrayList;

public class Max {
    public static void main (String args []) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(2); 
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        // Print Max - O(n)
        int max =Integer.MIN_VALUE;
        for(int i = 0; i<list.size();i++) {
            // if (list.get(i)> max){
            //     max = list.get(i);
            // }
            max = Math.max(max,list.get(i)); // Single line cone for above one
        }

        System.out.println("The Maximum from the given ArrayList is "+ max);
        

    }
}
