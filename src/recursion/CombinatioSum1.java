package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinatioSum1 {
    static List<List<Integer>> trolly = new ArrayList<>();
    public static void main(String[] args) {
        int [] arr = {2,3,5};
        System.out.println(combinationSum1(arr, 8));

    }

    public static List<List<Integer>> combinationSum1(int [] arr, int target){
        List<Integer> bag = new ArrayList<>();
        helper(0, arr, bag, target, 0);
        return trolly;
    }

    public static void helper(int i, int [] arr, List<Integer> bag, int target, int sum ){

        if(i == arr.length || sum > target ){
            return;
        }

        if(sum == target){
            trolly.add(new ArrayList<>(bag));
            return;
        }

        bag.add(arr[i]);
        helper(i, arr, bag, target, sum+arr[i]);
        bag.remove(bag.size()-1);
        helper(i+1, arr, bag, target, sum);


    }
}
