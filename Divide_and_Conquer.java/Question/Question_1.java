public class Question_1 {
    pubic static String[] mergeSort(String[] arr, int lo,int hi) {
        if(lo == hi) {
            String [] A = {arr[lo]};
            return A;
        }
    }
    public static void main (String args[]){
    String [] arr = {"sun","earth","mars","mercury"};
    String [] a = mergeSort(arr,0,arr.length-1);
    for (int i = 0; i<a.length; i++){
        System.out.println(a[i]);
    }
    }
}
