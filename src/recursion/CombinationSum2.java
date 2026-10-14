package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    static List<List<Integer>> trolly = new ArrayList<>();
    public static void main(String[] args) {
        int [] arr = {10,1,2,7,6,1,5};
        System.out.println(combinationSum2(arr, 8));

//        Input: candidates = [10,1,2,7,6,1,5], target = 8
//        Output: [[1,1,6], [1,2,5], [1,7], [2,6]]

    }

    public static List<List<Integer>> combinationSum2(int [] arr, int target){
        Arrays.sort(arr);
        List<Integer> bag = new ArrayList<>();
        helper(0, arr, bag, target, 0);
        return trolly;
    }

    public static void helper(int index, int [] arr, List<Integer> bag, int target, int sum ){
        if(sum == target){
            trolly.add(new ArrayList<>(bag));
            return;
        }
        if(sum > target){
            return;
        }
        for(int i = index; i < arr.length; i++){
            if(index != i && arr[i] == arr[i-1]){
                continue;
            }
            bag.add(arr[i]);

            helper(i+1, arr, bag, target, sum+arr[i]);
            bag.remove(bag.size()-1);
        }
    }
}
