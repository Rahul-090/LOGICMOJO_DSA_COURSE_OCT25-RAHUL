package DP;

import java.util.Arrays;

public class Fibonnaci {

    public static void main(String [] args){
        int n = 4;

        System.out.println(fib(n));
        int [] memo = new int[n+1];
        Arrays.fill(memo, -1);
        System.out.println(fib_memo(n, memo));
        int [] dp = new int[n+1];
        System.out.println(fib_tab(n, dp));
        System.out.println(fib_space_opt(n));
    }

    //recursion
    //T.C - O(2^n)
    //S.C - O(N)
    public static int fib(int n){
        if(n < 2) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    
    //using memoization top down
    //T.C - O(n)
    //S.c - O(n) + recursion call stack O(n)
    public static int fib_memo(int n, int [] memo){
        if(n < 2){
            return n;
        }
        if(memo[n] != -1){
            return memo[n];
        }
        memo[n] = fib_memo(n-1, memo)+fib_memo(n-2, memo);
        return memo[n];
    }

    //tabulation top down;
    //T.C - O(N)
    //S.c - O(N)
    public static int fib_tab(int n, int [] dp){
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    //space optimization
    public static int fib_space_opt(int n){
        int first = 0;
        int second = 1;
        int curr = 0;

        for(int i = 2; i <=n; i++){
            curr = first+second;
            first = second;
            second = curr;
        }

        return curr;
    }
}
