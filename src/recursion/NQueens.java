package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NQueens {
    public static void main(String[] args){
        int  n = 5;


        System.out.println(nQueens(n));
    }

    public static  List<List<String>> nQueens( int n){
        List<List<String>> ans = new ArrayList<>();
        char [][] board = new char[n][n];

        //initialize board
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }
        helper(0,  ans, board, n);
        return ans;
    }

    public static void helper(int row, List<List<String>> ans, char [][] board, int n){
        if(row == n){
            //generatedBoard
            ans.add(generatedBoard(board));
            return;
        }

        for(int col = 0; col < n; col++){
            if(canPlaceHere(row, col, board, n)){
                board[row][col] = 'Q';
                helper(row+1, ans, board, n);
                board[row][col] = '.';
            }
        }

    }

    public static boolean canPlaceHere(int row, int col, char[][] board, int n ){

        //check straight up
        for(int i = 0; i < row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // check left diaginal
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i-- , j--){
            if(board[i][j] == 'Q'){
                return false;
            }

        }

        //check right diaginal
        for(int i = row-1, j = col+1; i >= 0 && j < n; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static List<String> generatedBoard(char [][] board){
        List<String> res = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            res.add(new String(board[i]));
        }

        return res;
    }
}
