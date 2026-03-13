package DP;

import java.util.Arrays;

public class isSubset {
    public static void main(String[] args) {
        int [] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = arr.length;
        int [][] memo = new int[n+1][sum+1];
        for(int i = 0; i <= n; i++){
            Arrays.fill(memo[i],-1);
        }
        System.out.println(helperMemo(n, arr, sum, memo));

        Boolean [][] dp = new Boolean[n+1][sum+1];
        System.out.println(helperDP(n, arr, sum, dp));
    }

    //similar to equal partition sum

    //T.C = O(n)
    //S.c = O(n)
    public static Boolean helperDP(int n, int [] arr, int sum, Boolean[][] dp){

        //base condition
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < sum+1; j++){
                if(i == 0){
                    dp[i][j] = false;
                }
                if(j == 0){
                    dp[i][j] = true;
                }
            }
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < sum+1; j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][sum];
    }


    //

    //Time complexity = O(sum*n)
    //Space Complexity = O(n) recursion call stack Max depth = n
    public static Boolean helperMemo(int n, int [] arr, int sum, int [][] memo){
        if(sum == 0){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(memo[n][sum] != -1){
            return memo[n][sum] == 1;
        }

        if(arr[n-1] <= sum){
            memo[n][sum] = helperMemo(n-1, arr, sum-arr[n-1], memo) || helperMemo(n-1, arr, sum, memo)?1:0;
            return memo[n][sum] == 1;
        }else{
            memo[n][sum] = helperMemo(n-1, arr, sum, memo) ?1:0;
            return memo[n][sum] == 1;
         }
    }

    //recursive code Time Complexity - 2^n S.C O(n) call stack -> n depth
    public static Boolean helper(int n, int [] arr, int sum){
        if(sum == 0){
            return true;
        }
        if(n == 0){
            return false;
        }

        if(arr[n-1] <= sum){
            return helper(n-1, arr, sum-arr[n-1]) || helper(n-1, arr, sum);
        }else{
            return helper(n-1, arr, sum);
        }

    }
}
