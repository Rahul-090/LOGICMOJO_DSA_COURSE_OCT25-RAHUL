package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitBasket {
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,2};
        System.out.println("Longest Substring with K Unique Character: "+totalFruit(arr));
    }

    public static int totalFruit(int[] fruits) {
        int k = 2;
        int i = 0;
        int j = 0;
        int n = fruits.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int maxLen = 0;

        while(j < n){
            // calci 1
            mpp.put(fruits[j], mpp.getOrDefault(fruits[j], 0)+1);

            if(mpp.size() < k || mpp.size() == k){
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }else{
                while(mpp.size() > k){
                    mpp.put(fruits[i], mpp.get(fruits[i])-1 );
                    if(mpp.get(fruits[i]) == 0){
                        mpp.remove(fruits[i]);
                    }
                    i++;
                }
                j++;
            }

        }

        return maxLen;
    }
}
