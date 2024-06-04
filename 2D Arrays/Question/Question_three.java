public class Question_three {
    public static void main(String args []) {
        int matrix [][]={{11,12,13},{21,22,23}};

        int row = matrix.length;
        int column = matrix[0].length;
        printMatrix(matrix);

        int transpore [][] = new int [column][row];

        for(int i=0;i<row;i++){
            for(int j=0; j<column; j++) {
                transpore [j][i] = matrix [i][j];
            }
        }

        printMatrix(transpore);
    }
    public static void printMatrix(int matrix [][]) {
        System.out.println("The Matrix is :");
        for (int i=0; i<matrix.length; i++) {
            for (int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }  
            System.out.println();
        }
    }
}
