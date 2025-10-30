package arrays;

import java.util.*;
public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println("Product: "+Arrays.toString(productExceptItself(arr)));
    }

    public static int [] productExceptItself(int [] arr){
        int n = arr.length;
        int [] left = new int[n];

        int carry = 1;
        for(int i = 0; i < n; i++){
            left[i] = carry;
            carry = carry * arr[i];
        }

        carry = 1;

        for(int i = n-1; i >=0; i--){
            left[i] = left[i]*carry;
            carry = carry*arr[i];
        }
        return left;
    }
}
