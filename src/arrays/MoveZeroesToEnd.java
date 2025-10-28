package arrays;

import java.util.*;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(0, 1, 0, 3, 12));
        System.out.println("Move Zeroes to end: "+moveZeroes(arr));
    }

    public static List<Integer> moveZeroes(List<Integer> arr){
        int n = arr.size();

        int j = -1;
        //find the first zero
        for(int i = 0; i < n; i++){
            if(arr.get(i) == 0){
                j = i;
                break;
            }
        }

        if(j == -1){
           return arr;
        }
        //then swap with non zero ele and increment j
        for(int i = j+1; i < n; i++){
            if(arr.get(i) != 0) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                j++;
            }
        }
        return arr;
    }
}
