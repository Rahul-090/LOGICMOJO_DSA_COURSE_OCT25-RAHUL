package strings;

public class ReverseWordsInString {
    public static void main(String [] args) {
        String st = "the sky is blue";
        System.out.println("ReverseString: " + reverseString(st));

    }
    public static String reverseString(String s){
        int n = s.length();
        int startIndex = n-1;
        int endIndex = startIndex;
        StringBuilder res = new StringBuilder();
        while(startIndex >= 0){
            //removing trailing white spaces;
            while(startIndex >= 0 && s.charAt(startIndex) == ' ' ){
                startIndex--;
            }

            if(startIndex < 0){
                break;
            }
            endIndex = startIndex;


            //taking word and putting in builder
            while(startIndex >= 0 && s.charAt(startIndex) != ' '){
                startIndex--;
            }
            if( res.length() == 0){
                res.append(s.substring(startIndex+1, endIndex+1));

            }else{
                res.append(" ");
                res.append(s.substring(startIndex+1, endIndex+1));
            }
            startIndex--;


        }
        return res.toString();

    }

}
