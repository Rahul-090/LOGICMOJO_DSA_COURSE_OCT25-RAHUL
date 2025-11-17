package arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxOperations {
    public static void main(String [] args){
        int [] arr = {3,1,3,4,3};
        System.out.println("Max Number of K-Sum Pairs: "+maxOperations(arr, 6));
    }

    public static int maxOperations(int[] arr, int k) {
        int count = 0;
        Map<Integer, Integer> mpp = new HashMap<>();

        for(int i =0; i< arr.length; i++){
            int diff = k - arr[i];

            if(mpp.containsKey(diff)){
                count++;
                //if count is 1 remove
                if(mpp.get(diff) ==  1){
                    mpp.remove(diff);
                }
                //if count is greater than 2 decrement count;
                else{
                    mpp.put(diff, mpp.get(diff)-1);
                }

            }else{
                mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
            }
        }
        return count;
    }
}
