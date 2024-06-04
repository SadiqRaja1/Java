import java.util.ArrayList;
// Brute Force (All possible output) O(n^2)
public class Container_with_Most_Water {

    public static int Water_Stored(ArrayList<Integer>Height) {
        
        int maxWater = 0;
        for(int i=0; i<Height.size(); i++){
            for(int j = i+1; j<Height.size(); j++) {
                int Line_height =Math.min(Height.get(i), Height.get(j));
                int Width = j-i;

                int currWater = Line_height *Width;
                maxWater = Math.max(currWater, maxWater);
            } 
        }
        return maxWater;
    }

    public static void main (String args []) {
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
        
        System.out.println("The maximum water which can be stored is " + Water_Stored(Height));
        
    }
}
