package arrays;
import java.util.*;
public class MajortyElement2 {
    public static void main(String[] args) {
        int [] arr = {3, 2, 3};
        System.out.println("Majority Element 2: "+majorityElement2(arr));
    }

    public static List<Integer> majorityElement2(int [] arr){
        int ele1 = Integer.MAX_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(count1 == 0 && arr[i] != ele2){
                count1 = 1;
                ele1 = arr[i];
            } else if (count2 == 0 && arr[i] != ele1) {
                count2 = 1;
                ele2 = arr[i];
            } else if (arr[i] == ele1) {
                count1++;
            } else if (arr[i] == ele2) {
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        count1 = 0;
        count2 =0;
        for(int i = 0; i < n; i++){
            if(arr[i] == ele1){
                count1++;
            }
            if(arr[i] == ele2){
                count2++;
            }
        }

        if(count1 > n/3){
            res.add(ele1);
        }

        if(count2 > n/3){
            res.add(ele2);
        }

        return res;
    }
}
