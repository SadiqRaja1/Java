import java.util.ArrayList;

public class Heap_Insert_Peek {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            //add at last idx
            arr.add(data);

            int x = arr.size()-1; // x is child idx
            int par = (x-1)/2;

            while (arr.get(x) < arr.get(par)){ // O(logn) (Because we are not travelling to every node we directly checking parent and swaping)
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x =par;
                par = (x-1)/2; // changes made later in remove heap
            }
        }
        
        public int peek(){ // Peek
            return arr.get(0);
        }
    }
    public static void main (String args[]){
        
    }
}
