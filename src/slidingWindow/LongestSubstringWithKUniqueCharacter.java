package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniqueCharacter {
    public static void main(String[] args) {
        String s = "aabbcc";
        System.out.println("Longest Substring with K Unique Character: "+longestSubstring(s, 3));
    }

    public static int longestSubstring(String s, int k){
        int n = s.length();
        int i = 0;
        int j = 0;
        Map<Character, Integer> mpp= new HashMap<>();
        int maxLen = 0;
        while(j < n){
            //calci 1
            mpp.put(s.charAt(j), mpp.getOrDefault(s.charAt(j), 0)+1);


            if(mpp.size() < k){
                j++;
            }else if(mpp.size() == k){
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }else{
                //calci 2
                while(mpp.size() > k){
                    mpp.put(s.charAt(i), mpp.getOrDefault(s.charAt(i), 0)-1);
                    if(s.charAt(i) < 1){
                        mpp.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }

        }
        return maxLen;
    }
}
