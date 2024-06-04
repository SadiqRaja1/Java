public class practic_one {
    public static void bubble (int a[]) {
        for (int i = 0; i<a.length-1; i++) {
            for(int j=0; j<a.length-1-i; j++) {
                if (a[j] > a[j+1]) {
                    int  temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int k = 0; k<a.length; k++) {
            System.out.print(a[k]);
        }
        
    }
    public static void main (String args[]) {
        int intput [] = {5,3,4,2,1};
        bubble(intput);
    }
}
