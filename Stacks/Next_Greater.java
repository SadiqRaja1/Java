import java.util.*;
public class Next_Greater {
    public static void main (String args[]) {
        int arr []= {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int NxtGreater [] = new int[arr.length];

        for(int i=arr.length-1;i >= 0; i--){
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //2 if-else
            if(s.isEmpty()){
                NxtGreater[i] = -1;
            }else {
                NxtGreater [i] = arr[s.peek()];
            }
            // push in s
            s.push(i);
        }

        for (int i=0; i<NxtGreater.length; i++){
            System.out.print(NxtGreater[i]+" ");
        }
        System.out.println();
    }
}

// next Greater Right (which we done here)
// next Greater left (Left to right code that int = 0 i<length-1)
/*  next smaller in right while(!s.isEmpty() && arr[s.peek()] >= arr[i]){ // need to chane this
                s.pop();
            } */
/*next smaller in left 
  for(int i=0 i<=arr.length-1; i++){ // change this
            //1 while
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){ // change this
                s.pop();
            }
 */