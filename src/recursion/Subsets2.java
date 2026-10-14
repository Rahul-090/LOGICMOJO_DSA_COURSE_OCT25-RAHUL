package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {

    static List<List<Integer>> trolly = new ArrayList<>();

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1};

        System.out.println(subsetsWithDup(arr));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> bag = new ArrayList<>();
        trolly.add(new ArrayList<>());
        helper(0, bag, nums);
        return trolly;
    }

    public static void helper(int index, List<Integer> bag, int [] nums){

        for(int i = index; i < nums.length; i++){
            if(i != index && nums[i] == nums[i-1]){
                continue;
            }

            bag.add(nums[i]);
            trolly.add(new ArrayList<>(bag));
            helper(i+1, bag, nums);
            bag.remove(bag.size()-1);
        }
    }
}
