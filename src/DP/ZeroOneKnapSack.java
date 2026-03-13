package DP;

import java.util.Arrays;

public class ZeroOneKnapSack {
    public static void main(String [] args){
        int W = 4;
        int [] val = {1, 2, 3};
        int [] wt = {4, 5, 1};
        System.out.println(knapsack(W, val, wt));
    }

    public static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        int [][] memo = new int[n+1][W+1];
        for(int i = 0; i <= n; i++){
            Arrays.fill(memo[i], 0);

        }
        return helperDp(W, val, wt, val.length, memo);
    }

    public static int helperDp(int W, int [] val, int[] wt, int n, int [][] dp){
        //base condition

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < W+1; j++){
                if(wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }


    public static   int helper(int W, int val[], int wt[], int n, int [][] memo){
        if(n == 0 || W == 0){
            return 0;
        }
        if(memo[W][n] != -1){
            return memo[W][n];
        }
        if(wt[n-1] <= W){
            memo[W][n] =  Math.max(val[n-1] + helper(W-wt[n-1], val, wt, n-1, memo), helper(W, val, wt, n-1, memo));

        }else{
            memo[W][n] =  helper(W, val, wt, n-1, memo);
        }
        return memo[W][n];
    }


}
