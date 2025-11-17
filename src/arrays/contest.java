package arrays;
import java.util.*;

public class contest {
    public static void main(String [] args){
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(3, 4));
//        System.out.println("Answer: "+find_competitor(arr.size(), arr));
//        System.out.println("Answer: "+median_array(arr, arr2));
    }


//    public static String median_array(List<Integer> nums1, List<Integer> nums2) {
//        // Write your code here
//        List<Integer> res = new ArrayList<>();
//        res.addAll(nums1);
//        res.addAll(nums2);
//
//        if(res.size() %2 == 0){
//            res.get(0
//        }
//    }

    public static int find_competitor(int n, List<Integer> arr) {
        // Write your code here
        int i = 0;
        int cat = 1;
        Map<Integer, List<Integer>> mpp = new HashMap<>();
        Collections.sort(arr);
        while(i < n){
            mpp.put(cat, new ArrayList<>(Arrays.asList(arr.get(i))) );

            i++;
            while(i < n && mpp.get(cat).size() != cat){

                mpp.get(cat).add(arr.get(i));
                i++;
            }
            cat++;
        }
        cat = 1;
        int res = 0;
        int eleCount = 0;
        for(int ele: mpp.keySet()){

            eleCount = mpp.get(ele).size();
            if(cat == mpp.get(ele).size()){
                res++;
            }
            cat++;
        }
        return res;

    }
}
