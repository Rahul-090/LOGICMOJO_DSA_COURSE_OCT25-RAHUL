package arrays;

import java.util.Arrays;

public class NextGreaterElement3 {
    public static void main(String[] args) {
        int num = 1354;
        //46521
        System.out.println("Nect greater ele: "+ nextGreaterElement3(num));
    }

    public static int nextGreaterElement3(int num){
        char[] nums = Integer.toString(num).toCharArray();

        int n = nums.length-1;
        int i = n-1;
        //first find the pivot desceding break;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i==-1){
            return -1;
        }

        //swap with next greater of pivot
        int j = n;
        while(j >= 0 && nums[i] >= nums[j]){
            j--;
        }

        swap(nums, i, j);

        //reverse the right side of pivot
        reverse(nums, i+1, n);

        long digi = Long.parseLong(new String(nums));
        if(digi <= Integer.MAX_VALUE){
            return (int)digi;
        }else{
            return -1;
        }

    }

    public static void reverse(char[] arr, int s, int e){
        while(s<e){
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }


    public static void swap(char [] arr, int a, int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
}
