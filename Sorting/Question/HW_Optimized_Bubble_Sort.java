

public class HW_Optimized_Bubble_Sort {
    public static void bubblesort (int arr []) {
        boolean swapped = false;
        for (int turn=0; turn<arr.length-1; turn++) {
            for (int j=0; j<arr.length-1-turn; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false){
                break;
            }
        }
    }
    public static void printArr(int arr []) {
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main (String args []) {
        int arr [] = {1,2,3,4,5};
        bubblesort(arr);
        printArr(arr);
    }
}
