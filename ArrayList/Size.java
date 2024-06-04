import java.util.ArrayList;

public class Size {
    public static void main (String args []) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1); 
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int Size = list.size();
        System.out.println("The ArrayList size is "+Size);
    }
}
