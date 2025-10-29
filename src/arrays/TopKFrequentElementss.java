package arrays;

import java.util.Arrays;
import java.util.*;

public class TopKFrequentElementss {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3};
        System.out.println("Top K Frequent Element: "+ Arrays.toString(topKFrequentElement(arr, 2)));
    }

    public static int[] topKFrequentElement(int [] arr, int k){
        Map<Integer, Integer> mpp  = new HashMap<>();

        //count the frequency
        for(int ele: arr){
            if(mpp.containsKey(ele)){
                mpp.put(ele, mpp.get(ele)+1);
            }else{
                mpp.put(ele, 1 );
            }
        }

        //now create array of list cause there can be multiple ele with same frequency;
        List<Integer> [] flipped = new ArrayList[arr.length+1];

        //create empty list
        for(int i = 0; i < flipped.length; i++){
            flipped[i] = new ArrayList<>();
        }

        //fill flipped array with frequency
        for(Integer key: mpp.keySet()){
            flipped[mpp.get(key)].add(key);
        }

        int [] res = new int[k];
        int j = 0;
        //take top k frequent ele
        for(int i = flipped.length-1; i>00; i--){
            if(j==k){
                return res;
            }
            if(flipped[i].size()!=0){
                for(int a: flipped[i]){
                    res[j] = a;
                    j++;
                }
            }
        }
        return res;

    }
}
