package strings;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Group Anagram: "+groupAnagram(strs));
    }
    //T.C = O(n*klogk) -> klogk to sort every string
    //S.C = O(n*k)
    public static List<List<String>> groupAnagramm(String [] strs){

        Map<String, List<String>> mpp = new HashMap<>();
        for(String str: strs){
            char [] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if(mpp.containsKey(sortedStr)){
                mpp.get(sortedStr).add(str);
            }else{
                mpp.put(sortedStr, new ArrayList<>(Arrays.asList(str)));
            }
        }
        return new ArrayList<>(mpp.values());
    }

    //this code will run in O(n) cause we removed sorting
    //S.C = O(n*k)
    public static List<List<String>> groupAnagram(String [] strs){
        Map<String, List<String>> mpp = new HashMap<>();

        for(String str: strs){
            int [] count = new int[26];

            for(char ch: str.toCharArray()){
                count[ch - 'a']+=1;
            }
            StringBuilder res = new StringBuilder();
            for(int digi: count){
                res.append(digi).append(',');
            }
            String leader = new String(res);

            if(mpp.containsKey(leader)){
                mpp.get(leader).add(str);
            }else{
                mpp.put(leader, new ArrayList<>(Arrays.asList(str)));
            }

        }
        return new ArrayList<>(mpp.values());
    }



}
