package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation1 {

    static List<List<Integer>> trolly = new ArrayList<>();

    public static void main(String[] args) {
        int [] arr = {1, 2, 3};

        System.out.println("Permutation: "+permutation(arr));

    }

    public static List<List<Integer>> permutation(int [] arr){
        List<Integer> bag = new ArrayList<>();
        helper(arr, bag);
        return trolly;
    }

    public  static void helper(int [] arr, List<Integer> bag){

        if(arr.length == bag.size()){
            trolly.add(new ArrayList<>(bag));
            return;
        }

        for(int i = 0; i < arr.length; i++){
            if(bag.contains(arr[i])){
                continue;
            }
            bag.add(arr[i]);
            helper(arr, bag);
            bag.remove(bag.size()-1);
        }
    }
}
