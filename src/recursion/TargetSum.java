package recursion;


import java.util.ArrayList;
import java.util.List;

public class TargetSum {

    static int count = 0;
    public static void main(String[] args) {
//        Input: nums = [1,1,1,1,1], target = 3
//        Output: 5
        int [] arr = {1, 1, 1, 1, 1};

        System.out.println(targetSum(arr, 3));
    }

    public static int targetSum(int [] arr, int target){

        helper(0, arr, target, 0);
        return count;
    }

    public static void helper(int i, int [] arr, int target, int sum){

        if(i == arr.length){
            if(sum == target){
                count++;
            }
            return;
        }

        helper(i+1, arr, target, sum+arr[i]);
        helper(i+1, arr, target, sum-arr[i]);
    }
}
