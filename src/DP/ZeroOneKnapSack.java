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
        int [][] memo = new int[W+1][n+1];
        for(int i = 0; i <= W; i++){
            Arrays.fill(memo[i], -1);
        }
        return helper(W, val, wt, val.length, memo);
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
