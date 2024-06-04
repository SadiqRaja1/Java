import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.BlockElement;

public class Operation {
     public static void main (String args []) {
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> list2 = new ArrayList<>();
        ArrayList <Boolean> list3 = new ArrayList<>();

        // Add Element - O(1)
        list.add(1); 
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(3, 44); // O(n) /Can add element by giving the index and the element are move right side.
        list.add(6, 15); //Experiment Success that you can one index more like your array list is of index "0" to "5" but you can add on index "6" but not on index "7".

        // Get Element - O(1)
        int element = list.get(2);
        System.out.println(element);

        // Remove Element (Delete) - O(n)
        list.remove(2);
        System.out.println(list);

        // Set Element at Index - O(n)
        list.set(3, 10);
        System.out.println(list);

        // Contain Element -O(n) Searching an element
        boolean check = list.contains(1);
        System.out.println(check);

    // Or you can Write
        System.out.println(list.contains(2));
        System.out.println(list.contains(11));

    }
}
