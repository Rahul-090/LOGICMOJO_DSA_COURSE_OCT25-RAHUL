package slidingWindow;

import java.util.*;

public class CountOccurenceOfAnagram {
    public static void main(String[] args) {
        String st = "cbaebabacd";
        String p = "abc";
        System.out.println("Count occurence of anagram: "+countOccurence(st, p));
    }

    public static List<Integer> countOccurence(String st, String pt){
        Map<Character, Integer> mpp = new HashMap<>();

        for(int i = 0; i < pt.length(); i++){
            mpp.put(pt.charAt(i), mpp.getOrDefault(pt.charAt(i), 0)+1);

        }
        int count = mpp.size();

//        int countRes = 0;
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = pt.length();
        while(j < st.length()){
            //calci 1
            if(mpp.containsKey(st.charAt(j))){
                mpp.put(st.charAt(j), mpp.get(st.charAt(j))-1);
                if(mpp.get(st.charAt(j)).equals(0)){
                    count--;
                }
            }

            //if smaller than k
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                //calci 2
                if(count == 0){
                    res.add(i);
                }
                //removing calci
                if(mpp.containsKey(st.charAt(i))){
                    mpp.put(st.charAt(i), mpp.get(st.charAt(i))+1);

                    if(mpp.get(st.charAt(i)).equals(1)){
                        count++;
                    }
                }
                i++;
                j++;
            }

        }
        return res;
    }
}
