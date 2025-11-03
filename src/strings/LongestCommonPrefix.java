package strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"dog","racecar","car"};
        System.out.println("Longest Common Prefix: "+prefix(strs));
    }

    public static String prefix(String[] strs){
        Arrays.sort(strs);
        int n = strs.length;
        char[] firstStr = strs[0].toCharArray();
        char[] lastStr = strs[n-1].toCharArray();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < firstStr.length; i++){
            if(firstStr[i] == lastStr[i]){
                res.append(firstStr[i]);
            }else{
                break;
            }
        }
        if(res.length() == 0){
            return "";
        }

        return res.toString();

    }
}
