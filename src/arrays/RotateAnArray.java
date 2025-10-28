package arrays;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println("Rotated Array: "+Arrays.toString(rotateArray(arr, k)));
    }

    public static int[]  rotateArray(int [] arr, int k){
        int n = arr.length-1;
        k = k%n;
        reverseArr(arr, 0, n);
        reverseArr(arr, 0, k-1);
        reverseArr(arr, k, n);
        return arr;

    }

    public static void reverseArr(int [] arr, int s, int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
