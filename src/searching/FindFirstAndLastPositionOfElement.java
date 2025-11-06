package searching;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int [] arr = {5, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println("First and Last Position Ele: "+ Arrays.toString(firstAndLast(arr, target)));
    }

    public static int[] firstAndLast(int [] arr, int target){
        int firstIndex = firstAndLastHelper(arr, target, true);
        int secondIndex = firstAndLastHelper(arr, target, false);
        return new int[]{firstIndex, secondIndex};

    }

    public static int firstAndLastHelper(int [] arr, int target, Boolean first){
        int start = 0;
        int end = arr.length-1;
        int ind = -1;
        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                ind = mid;
                if(first){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ind;
    }


}
