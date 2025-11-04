package arrays;
import java.util.*;

public class MinimizeMaximumPairSum {
    public static void main(String[] args) {
        int [] arr = {3,2,4,1,1,5,1,3,5,1};
        // [2, 3, 4, 4, 5, 6]
        System.out.println("Minimize Maximum Pair Sum: "+minimizeMaxPairSum(arr));
    }

    public static int minimizeMaxPairSum(int [] arr){
        int i = 0;
        int j = arr.length-1;

        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        while(i < j){
            int maxPairSum = arr[i]+arr[j];
            max = Math.min(max, maxPairSum);
            i++;
            j--;
        }
        return max;

    }
}
