import java.util.ArrayList;
public class Question_1 {
    public static boolean CheckMonotonic(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i< list.size()-1; i++){
            if (list.get(i)<list.get(i+1)) {
                inc = false;
            }
            if (list.get(i)>list.get(i+1)) {
                dec = false;
            }
            
        }
        return inc || dec;
    }
    public static void main (String args []) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);

        list2.add(6);
        list2.add(5);
        list2.add(4);
        list2.add(4);

        list3.add(1);
        list3.add(3);
        list3.add(2);

        System.out.println(CheckMonotonic(list1));
        System.out.println(CheckMonotonic(list2));
        System.out.println(CheckMonotonic(list3));

    }
    
}
