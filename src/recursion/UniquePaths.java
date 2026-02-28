package recursion;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 2));
    }

    public static int uniquePaths(int m, int n) {
        int [][] memo = new int[m][n];

        return helper(0, 0, m, n, memo);
    }

    public static int helper(int row, int col, int m, int n,int [][] memo){
        if(row >= m || col >= n){
            return 0;
        }

        if(row == m-1 && col == n-1 ){
            return 1;
        }
        if(memo[row][col] != 0){
            return memo[row][col];
        }

        int count = 0;


        //can move down
        count+=helper(row+1, col, m, n, memo);

        //can move right
        count+=helper(row, col+1, m, n, memo);
        memo[row][col] = count;
        return count;
    }
}
