package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args ){
        String  s= "pwwkew";
        System.out.println("Longest Substring without repeating character: "+longestSubstringR(s));
    }

    public static int longestSubstringR(String s){
        int i = 0;
        int j = 0;
        int n = s.length();
        Map<Character, Integer> mpp = new HashMap<>();
        int maxLen = 0;
        while(j < n){
            //calci 1
            mpp.put(s.charAt(j), mpp.getOrDefault(s.charAt(j), 0)+1);

            if(j-i+1 < mpp.size()){
                j++;
            }else if(j-i+1 == mpp.size()){
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }else{
                //calci 2
                while(j-i+1 > mpp.size()){
                    mpp.put(s.charAt(i), mpp.getOrDefault(s.charAt(i),0)-1);
                    if(mpp.get(s.charAt(i)) == 0){
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
