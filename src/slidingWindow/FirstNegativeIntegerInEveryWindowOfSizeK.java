package slidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeIntegerInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int [] arr = {-8, 2, 3, -6, 1};
        int k = 2;
        System.out.println("First Negative Integer in every window of size k: "+firstNegative(arr, k));
    }

    public static List<Integer> firstNegative(int [] arr, int k){
        int n = arr.length;
        int i = 0;
        int j = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();

        while(j < n){
            //calculation
            if(arr[j] < 0){
                queue.add(arr[j]);
            }

            if(j-i+1 < k){
                j++;
            }else{
                if(queue.size() == 0){
                    res.add(0);
                }else{
                    res.add(queue.peek());
                    if(queue.peek()==arr[i]){
                        queue.poll();
                    }

                }
                i++;
                j++;
            }
        }
        return  res;
    }
}
