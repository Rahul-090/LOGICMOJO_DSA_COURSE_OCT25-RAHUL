package arrays;
import java.util.*;
public class RotateMatrix {
    public static void main(String[] args) {
        /*
        [1,2,3]   1 4 7   7 4 1
        [4,5,6]   2 5 8   8 5 2
        [7,8,9]   3 6 9   9 6 3
        first transpose and then reverse rows;
         */
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Rotate Matrix: "+ Arrays.deepToString(rotateMatrix(arr)));
    }

    public static int[][] rotateMatrix(int [][] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            reverseArr(arr[i], 0, n-1);
//            Array.rev
        }
        return arr;
    }


    public static void reverseArr(int [] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
