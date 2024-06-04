import java.util.*;
public class HashMap_Opeerations {
    public static void main (String args[]) {
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("China", 150);
        hm.put("India", 100);
        hm.put("US", 50);

        System.out.println(hm);

        //Get - O(1);
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonasia")); // if it not there in HashMap then Null value comes

        //ContainsKey - O(1)
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Indonasia")); // false

        //Remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm.remove("Indonasia"));

        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());
        hm.clear(); // will clear all the data in HashMap
        System.out.println(hm.isEmpty());
    }
}
