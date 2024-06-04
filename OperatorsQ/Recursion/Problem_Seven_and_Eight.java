public class Problem_Seven_and_Eight {

    public static  int LO (int arr[], int key, int i){
        if (i == arr.length-1) {
            return -1;
        }
        int isfound = LO(arr,key,i+1);
        if(isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static  int FO (int arr[], int key, int i){
        if (i == arr.length-1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FO(arr, key, i+1);
    }
    public static void main (String args []) {
        int arr [] = {8,3,6,9,5,10,2,5,3};
        System.out.println(FO(arr, 5, 0));
        System.out.println(LO(arr, 5, 0));
    }
}