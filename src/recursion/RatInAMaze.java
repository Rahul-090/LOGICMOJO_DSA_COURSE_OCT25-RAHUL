package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RatInAMaze {

    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        System.out.println(findPath(maze));
    }

    public static List<String> findPath(int [][] maze){
        List<String> ans = new ArrayList<>();
        StringBuilder bag = new StringBuilder();
        int n = maze.length;
        if(maze[0][0] == 0){
            return ans;
        }
        boolean [][] visited = new boolean[n][n];
        helper(0, 0, maze, ans, bag, visited, n);
        Collections.sort(ans);
        return ans;
    }

    public static void helper(int row, int col, int [] [] maze, List<String> ans, StringBuilder bag, boolean [][] visited, int n){
        if(row == n-1 && col == n-1){
            ans.add(bag.toString());
            return;
        }

        visited[row][col] = true;

        //Down
        if(canVisit(row+1, col, maze, visited)){
            bag.append('D');
            helper(row+1, col, maze, ans, bag, visited, n);
            bag.deleteCharAt(bag.length()-1);
        }

        //Up
        if(canVisit(row-1, col, maze, visited)){
            bag.append('U');
            visited[row][col] = true;
            helper(row-1, col, maze, ans, bag, visited, n);
            bag.deleteCharAt(bag.length()-1);
        }

        //left
        if(canVisit(row, col-1, maze, visited)){
            bag.append('L');
            visited[row][col] = true;
            helper(row, col-1, maze, ans, bag, visited, n);
            bag.deleteCharAt(bag.length()-1);
        }

        //right
        if(canVisit(row, col+1, maze, visited)){
            bag.append('R');
            visited[row][col] = true;
            helper(row, col+1, maze, ans, bag, visited, n);
            bag.deleteCharAt(bag.length()-1);
        }

        visited[row][col] = false;

            }


    public static boolean canVisit(int row, int col, int [][] maze, boolean [][] visited){

        return  row < maze.length && col < maze.length && row >= 0 && col >= 0 &&  maze[row][col] == 1 && !visited[row][col];
    }

}
