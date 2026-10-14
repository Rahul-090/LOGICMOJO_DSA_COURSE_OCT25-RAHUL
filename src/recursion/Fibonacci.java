package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibbo(4));
        System.out.println(fib(4));
        System.out.println(fibi(4));
    }

    public static int fibbo(int n){
        if(n < 2){
            return n;
        }
        return fibbo(n-1) + fibbo(n-2);
    }

    public static int fib(int n){
        List<Integer> fibo = new ArrayList<>(Arrays.asList(0, 1));
        if(n < 2){
            return n;
        }
        for(int i = 2; i <= n; i++){
            fibo.add(fibo.get(i-2)+fibo.get(i-1));

        }
        return fibo.get(n);

    }

    public static int fibi(int n){
        if(n < 2){
            return n;
        }

        int first = 0;
        int second = 1;
        int curr = 0;

        for(int i = 2; i <= n; i++){
            curr = first + second;
            first = second;
            second = curr;
        }
        return curr;
    }
}
