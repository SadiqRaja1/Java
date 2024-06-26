import java.util.Scanner;
public class nQueen_1_Solution {
    public static boolean isSafe(char board[][],int row,int col ){
        // Vertical Up
        for(int i=row-1; i>=0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Left Diagonal Up
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board [i][j]=='Q') {
                return false;
            }
        }
        // Right Diagonal Up
        for (int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board [i][j]=='Q') {
                return false;
            }
        }
        return true;

    }
    public static boolean nQueens(char board[][], int row) {
        // base
        if (row == board.length){
            printboard(board);
            return true;
        }
        
        // column loop
        for (int j=0;j<board.length;j++) {
            if(isSafe(board, row, j)) {
                board[row][j] ='Q';
                if(nQueens(board, row+1)) { // function call
                    return true;
                } 
                board[row][j] = 'x'; // backtracking step
            }
        }
        return false;
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
        System.out.print("Enter you number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char board [] [] = new char [n] [n];
        // initialize
        for (int i=0; i<n;i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'x';
            }
        }
        if(nQueens (board, 0)) {
            System.out.println("Solution is possible");
            printboard(board);
        }
        else {
            System.out.println("Solution is not possible");
        }
    }
}
