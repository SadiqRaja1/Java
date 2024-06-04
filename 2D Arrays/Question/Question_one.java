public class Question_one {
    public static void main (String args[]) {
        int array [][] = {{4,7,8},{8,8,7}};

        int countof7s =0;

        for (int i =0;i<array.length;i++) {
            for (int j=0;j<array[0].length;j++) {
                if (array[i][j]==7) {
                    countof7s++;
                }
            }
        }
        System.out.println("Count of 7s is " + countof7s);
    }
}
