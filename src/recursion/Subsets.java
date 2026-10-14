package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static List<List<Integer>> trolly = new ArrayList<>();
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};

        System.out.println(subsets(arr));
    }


    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> bag = new ArrayList<>();


        helper(0, nums, bag);
        return trolly;
    }

    public static void helper(int i, int[] nums, List<Integer> bag){
        if(i == nums.length){
            trolly.add(new ArrayList<>(bag));
            return;
        }

        bag.add(nums[i]);
        helper(i+1, nums, bag);
        bag.remove(bag.size()-1);
        helper(i+1, nums, bag);
    }
}
