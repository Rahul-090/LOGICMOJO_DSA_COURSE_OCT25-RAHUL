package sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int [] arr = {2,2};
        System.out.println("Find duplicate and missing item: "+ Arrays.toString(setMismatch(arr)));
    }

    public static int [] setMismatch(int [] arr){
        int i = 0;
        int n = arr.length;
        while(i < n){
            int correctInd = arr[i]-1;
            if(arr[i] != arr[correctInd]) {
                int temp = arr[correctInd];
                arr[correctInd] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
        int [] res = new int[2];
        int k = 0;
        for(int j = 0; j <=n; j++){
            if(j != arr[j]-1){
                res[0]=arr[j];//for duplicate
                res[1] = j+1;//for missing
                return res;
            }
        }
        return new int[]{-1,-1};


    }
}
