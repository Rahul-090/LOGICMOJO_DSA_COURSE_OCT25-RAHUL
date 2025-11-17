package strings;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args){
        char [] arr = {'a','a','b','b','c','c','c','d'};
        System.out.println("String Compression: "+ stringCompression(arr));
    }

    public static int stringCompression(char [] arr){
        int i = 0;
        int j = 1;
        int count = 1;
        int n = arr.length;
        while(j <= n){
            if(j == arr.length || arr[j-1] != arr[j]){
                arr[i] = arr[j-1];
                i++;
                if(count >=2 ){
                    for(char ele: Integer.toString(count).toCharArray()){
                        arr[i] = ele;
                        i++;
                    }
                }
                count = 1;
            }else{
                count++;
            }
            j++;
        }
        return i;
    }
}
