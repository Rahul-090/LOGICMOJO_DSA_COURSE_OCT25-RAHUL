package arrays;

import java.util.*;
public class RainWaterTrapping {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(4,2,0,3,2,5));
        System.out.println("Rain Water Trapping: "+trappingRainWater(arr));

    }

    public static int trappingRainWater(List<Integer> arr){
        int n = arr.size();
        int [] leftMax = new int[n];
        int [] rightMax = new int[n];

        //find left most max for every element;
        leftMax[0] = arr.get(0);
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(arr.get(i), leftMax[i-1]);
        }

        //find right most max for every element;
        rightMax[n-1] = arr.get(n-1);
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(arr.get(i), rightMax[i+1]);
        }

        //adding every water that is prsent above every element
        int waterSum = 0;
        for(int i = 0; i < n; i++){
            waterSum+=Math.min(leftMax[i], rightMax[i])-arr.get(i);
        }
        return waterSum;
    }

    public static int containerWithMostWater(List<Integer> arr){
        int i = 0;
        int j = arr.size()-1;
        int res = 0;
        while(i < j){
            res = Math.max((j-i)*Math.min(arr.get(i), arr.get(j)), res);
            if(arr.get(i) < arr.get(j)){
                i++;
            }else{
                j--;
            }
        }
        return res;
    }
}
