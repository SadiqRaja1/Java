import java.util.*;
public class Iteration_on_HashSet {
    public static void main (String args []) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // By Iterators
        // Iterator it = cities.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        for(String city : cities){
            System.out.println(city);
        }
    }
}
