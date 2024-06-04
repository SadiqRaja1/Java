public class Pratice_four {

    public static int trapped_water (int barheight []) {
        // left max boundary
        int MaxLeft [] = new int [barheight.length];
        MaxLeft[0] = barheight[0]; 
        for(int i=1; i<barheight.length; i++) {
            MaxLeft[i] = Math.max(MaxLeft[i-1], barheight[i]);

        }
        
        // right max boundary
        int n = barheight.length-1;
        int MaxRight [] = new int [n+1];
        MaxRight[n] = barheight[n]; 
        for(int i=n-1; i>=0; i--) {
            MaxRight[i] = Math.max(MaxRight[i+1], barheight[i]);

        }

        // trapped water calculation
        int Total_Stored_water = 0;
        for (int i = 0; i<barheight.length; i++) {
            int water_level = Math.min(MaxLeft[i], MaxRight[i]);
            int water_stored = (water_level - barheight[i]); // here if width have value 1 then water_stored = (water_level - barheight[i]) * width;
            if(water_stored >= 0) {
                Total_Stored_water += water_stored;
            } 
        }
        return Total_Stored_water;

    }
    public static void main (String args[]) {
        int barheight [] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int width = 1; // here width is 1 so not included
        System.out.println(trapped_water(barheight));
        int  a [] = {4,2,0,6,3,2,5};
        System.out.println(trapped_water(a));
        
    }
}
