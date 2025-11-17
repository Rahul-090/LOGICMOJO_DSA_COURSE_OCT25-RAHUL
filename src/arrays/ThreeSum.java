package arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String [] args){
        int [] arr = {-1,0,1,2,-1,-4};

        System.out.println("3 sum: "+threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int [] arr){
        if(arr.length < 3){
            return new ArrayList<>();
        }

        Arrays.sort(arr);
        Set<List<Integer>> res = new HashSet<>();

        for(int i = 0; i < arr.length-2; i++){

            int start = i+1;
            int end = arr.length-1;

            while(start < end){
                int sum = arr[i] + arr[start] + arr[end];

                if(sum == 0){
                   res.add(new ArrayList<>(Arrays.asList(arr[i], arr[start], arr[end])));
                   start++;
                   end--;
                }else if(sum < 0){
                    start++;
                }else{
                    end--;
                }
            }


        }

        return new ArrayList<>(res);
    }
}
