package strings;

public class isSubsequence {
    public static void main(String[] args){
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(" is subsequence: "+isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        // abc
        // ahbgdc
        //

        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }

        if(i == s.length()){
            return true;
        }

        return false;
    }
}
