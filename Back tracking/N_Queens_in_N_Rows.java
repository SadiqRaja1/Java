public class N_Queens_in_N_Rows {
    public static void nQueens(char board[][], int row) {
        // base
        if (row == board.length){
            printboard(board);
            return;
        }
        
        // column loop
        for (int j=0;j<board.length;j++) {
            board[row][j] ='Q';
            nQueens(board, row+1); // function call
            board[row][j] = '.'; // backtracking step
        }
    }
    public static void printboard(char board [][]) {
        System.out.println("------------Chees board------------");
        for (int i=0; i<board.length;i++) {
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main (String args []) {
        int n = 2;
        char board [] [] = new char [n] [n];
        // initialize
        for (int i=0; i<n;i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }
        nQueens (board, 0);
    }
}
/* As this same code need to modified for n-Queens problem
 makink second one for understanding 
 secind one made from coping this
 */
