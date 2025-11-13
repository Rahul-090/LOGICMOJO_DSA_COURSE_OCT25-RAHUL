package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String [] args){
        String s = "timetopractice";
        String p = "toc";

        System.out.println("Minimum Window Substring: "+minimumWindowSubstring(s, p));
    }

    public static String minimumWindowSubstring(String s, String p){
        Map<Character, Integer> mpp = new HashMap<>();
        for(int i = 0; i < p.length(); i++){
            mpp.put(p.charAt(i), mpp.getOrDefault(p.charAt(i), 0)+1);
        }
        int count = mpp.size();
        int i = 0;
        int j = 0;
        int n = s.length();
        int startIndex = 0;
        int minLen = Integer.MAX_VALUE;
        while(j < n){
            //calci 1
            if(mpp.containsKey(s.charAt(j))){
                mpp.put(s.charAt(j), mpp.get(s.charAt(j))-1);
                if(mpp.get(s.charAt(j)) == 0){
                    count--;
                }
            }

            if(count != 0){
                j++;
            }else {
                while(count==0){
                    if(j-i+1 < minLen){
                        minLen = j-i+1;
                        startIndex = i;
                    }

                    //calci 2
                    if(mpp.containsKey(s.charAt(i))){
                        mpp.put(s.charAt(i), mpp.get(s.charAt(i))+1);
                        if(mpp.get(s.charAt(i)) == 1){
                            count++;
                        }
                    }
                    i++;
                }
                j++;



            }
        }
        return minLen == Integer.MAX_VALUE?"":s.substring(startIndex, startIndex+minLen);



    }
}
