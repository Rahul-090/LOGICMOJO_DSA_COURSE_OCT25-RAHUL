package arrays;

import java.util.*;
public class LongestConseqeutiveSequence {
    public static void main(String[] args) {
        int [] arr = {0,3,7,2,5,8,4,6,0,1};
        //[0, 0, 1, 2, 3, 4, 6, 7, 8]
        System.out.println("Longest Conseqeutive sequence: "+longestConseqeutiveSequence(arr));
    }

    //T.c = O(N)
    public static int longestConseqeutiveSequence(int [] arr){
        Set<Integer> st = new HashSet<>();
        for(int ele: arr){
            st.add(ele);
        }
        int maxCount = 0;
        for(int ele: st){
            if(!st.contains(ele-1)){
                int count = 1;
                    while(st.contains(ele+1)){
                        count++;
                        ele=ele+1;
                    }
                    maxCount = Math.max(maxCount, count);

            }

        }
        return maxCount;
    }

    //Better using sorting and then comparing from previous and changeing currentSmallest
    public static int longestConseqeutiveSequenceBetter(int [] arr){
        Arrays.sort(arr);
        int currSmallest = Integer.MIN_VALUE;
        int count = 1;
        int maxCount = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i]-1== arr[i-1]){
                count++;
                currSmallest = arr[i];
            }else if(arr[i] != currSmallest){
                count = 1;
                currSmallest = arr[i];
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
