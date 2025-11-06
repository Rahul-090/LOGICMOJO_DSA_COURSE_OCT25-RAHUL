package sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumberDisappearedInArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        // range is given [1, n]

        System.out.println("Find all number disappeared in array: "+findAll(arr));

    }

    //we will be using cyclic sort
    //in which we first find the cooect position of element
    //then swap the element with element at its correct position
    //if already at correct position then move forward
    public static List<Integer> findAll(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i < n){
           int correctInd  = arr[i]-1;
           if(arr[i] != arr[correctInd] && arr[i] <= n){
               int temp = arr[correctInd];
               arr[correctInd] = arr[i];
               arr[i] = temp;
           }else{
               i++;
           }
        }

        List<Integer> res = new ArrayList<>();
        for(int j = 0; j < n; j++){
            if(j != arr[j]-1){
                res.add(j+1);
            }
        }
        return res;
    }
}
