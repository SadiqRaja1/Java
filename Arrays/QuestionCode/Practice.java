import java.util.*;
public class Practice {
    public static boolean check (int []a) {
        for(int i = 0; i<a.length; i++) {
            for(int j=i+1; j<a.length-i; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int findrotate(int []a) {
        int start = 0;
        int end = a.length-1;
        if(end < start) {
            return -1;
        }
        if(end == start) {
            return start;
        }
        while (start <= end) {
            int mid = (start + end) /2;
            if(a[mid]> a[mid+1]) {
                return mid+1;
            }else if(a[mid]<a[mid-1]) {
                return mid;
            }else if(a[mid] > a[start] && a[mid] > a[end]) {
                start = mid+1;
            }else {
                end = mid-1;
            }

        }
        return -1;
            
    }

    public static int findtarget (int []a, int target) {
        int startindex = findrotate(a);
        if(target == a[startindex]) {
            return startindex;
        }else if(target > a[startindex] && target <= a[a.length-1]) {
            return search(a, startindex, a.length-1, target);
        }else {
            return search(a, 0, startindex, target);
        }
        
    }

    public static int search (int[]a, int start, int end, int target) {
        int l = start;
        int r = end;
        while (l <= r) {
            int mid = (1+(l+r))/2;
            if(a[mid]==target) {
                return mid;
            }else if(a[mid]>target) {
                r = mid-1;
            }else {
                l = mid+1;
            }
        }
        return-1;
    }
    

    public static void find(int [] a , int b) {
        int start = a[1];
        int end = a[a.length-1];
    }

    public static int maxprofit(int arr[]) {
        int profit = 0;
        int buy = arr[0];

        for(int i=1; i<arr.length; i++) {
            if (buy < arr[i]) {
                profit = Math.max(arr[i] - buy, profit);
            }else {
                buy = arr[i];
            }
        }
        return profit;
        
    }

    public static void main (String args []) {
        /* Q1
        int example1[] = {1,2,3,1};
        int example2[] = {1,2,3,4};
        int example3[] = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(check(example1)+"\n"+ check(example2) + "\n" + check(example3));
        */
        
        /*
        int input1 [] = {4, 5, 6, 7, 0, 1, 2};
        int input1_target = 2;

        int input2 [] = {4, 6, 7, 0, 1, 2};
        int input2_target = 3;

        int input3 [] = {1};
        int input3_target = 0;

        System.out.println(findtarget(input1, input1_target));
        System.out.println(findtarget(input2, input2_target));
        System.out.println(findtarget(input3, input3_target));

        */
        /* 
        int prices [] = {7, 1, 5, 3, 6, 4};

        int prices0 [] = {7, 6, 4, 3, 1};

        System.out.println(maxprofit(prices));
        System.out.println(maxprofit(prices0));
        */

    }
}