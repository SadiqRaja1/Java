import java.util.*;
public class TreeSet_java {
    public static void main (String args[]){
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru"); 

        System.out.println(cities);

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");

        System.out.println(ts);
    }
}
