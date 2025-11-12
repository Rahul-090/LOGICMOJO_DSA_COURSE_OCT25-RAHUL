package slidingWindow;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int [] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println("Sliding Window Maximum: "+ Arrays.toString(slidingWindowMax(arr, 3)));
    }

    public static int [] slidingWindowMax(int [] arr, int k){
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = arr.length;
        Deque<Integer> dq = new ArrayDeque<>();

        while(j < n){
            //calci 1
            while(dq.size() != 0 && dq.getLast() < arr[j]){
                dq.pollLast();
            }

            dq.addLast(arr[j]);

            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                res.add(dq.getFirst());

                //calci 2
                if(arr[i] == dq.getFirst()){
                    dq.pollFirst();
                }
                i++;
                j++;
            }
        }
        int [] resArray = new int[res.size()];
        int a =0;
        for(int num: res){
            resArray[a] = num;
            a++;
        }
        return resArray;
    }
}
