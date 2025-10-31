package arrays;

import java.util.*;
public class SortArrayOf012 {
    public static void main(String[] args) {
        int [] arr = {2,0,1};
        System.out.println("Sorted Array: "+Arrays.toString(sort012(arr)));
    }

    public static int []  sort012(int [] arr){
      int start = 0;
      int mid = 0;
      int end = arr.length-1;

      while(mid <= end){
          if(arr[mid] == 0){
              int temp = arr[mid];
              arr[mid] = arr[start];
              arr[start] = temp;
              start++;
              mid++;
          }else if (arr[mid] == 1){
              mid++;
          }else{
              int temp = arr[mid];
              arr[mid] = arr[end];
              arr[end] = temp;
              end--;
          }
      }
      return arr;
    }


}
