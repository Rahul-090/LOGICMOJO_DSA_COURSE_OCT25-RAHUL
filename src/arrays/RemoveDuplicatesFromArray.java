package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 2, 3, 5, 6};
        System.out.println("Remove Duplicates From Array: "+removeDuplicatesFromSortedArray(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicatesFromSortedArray(int [] arr){
        int n = arr.length;
        int i = 0;
        int j = 1;
        while(j < n){
            if(arr[i] != arr[j]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        return i+1;

    }
}
