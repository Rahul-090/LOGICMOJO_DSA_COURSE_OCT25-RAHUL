package slidingWindow;
import java.util.*;

public class PermutationInString {
    public static void main(String[] args){
        String p = "abcdxabcde";
        String s = "abcdeabcdx";

        System.out.println("Permutation in String: "+permutationInString(p, s));
    }

    public static Boolean permutationInString(String p, String s){
        Map<Character, Integer> mpp = new HashMap<>();

        for(int i = 0; i < p.length(); i++){
            mpp.put(p.charAt(i), mpp.getOrDefault(p.charAt(i), 0)+1);
        }

        int i = 0;
        int j = 0;
        int count = mpp.size();
        while(j < s.length()){
            //calci 1
            if(mpp.containsKey(s.charAt(j))){
                mpp.put(s.charAt(j), mpp.get(s.charAt(j))-1);
                if(mpp.get(s.charAt(j))==0){
                    count--;
                }
            }

            if(j-i+1 < p.length()){
                j++;
            }else{
                if(count == 0){
                    return true;
                }
                //calci 2 removing
                if(mpp.containsKey(s.charAt(i))){
                    mpp.put(s.charAt(i), mpp.get(s.charAt(i))+1);
                    if(mpp.get(s.charAt(i)) == 1){
                        count++;
                    }
                }
                i++;
                j++;
            }

        }
        return false;
    }
}
