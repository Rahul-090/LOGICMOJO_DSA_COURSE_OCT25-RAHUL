package arrays;
import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Spiral Matrix: "+spiralMatrix(arr));
    }

    public static List<Integer> spiralMatrix(int [][] arr){
        int top = 0;
        int left = 0;

        int right = arr[0].length-1;
        int bottom = arr.length-1;

        List<Integer> res = new ArrayList<>();
        int dir = 0;
        while(left <= right && top <= bottom){
            if(dir == 0){
                for(int i = left; i <= right; i++){
                    res.add(arr[top][i]);
                }
                top++;
            }

            if(dir == 1){
                for(int i = top; i <= bottom; i++){
                    res.add(arr[i][right]);
                }
                right--;
            }

            if(dir == 2){
                for(int i = right; i >= left; i--){
                    res.add(arr[bottom][i]);
                }
                bottom--;
            }

            if(dir==3){
                for(int i = bottom; i >= top; i--){
                    res.add(arr[i][left]);
                }
                left++;
            }
            dir = (dir+1)%4;
        }
        return res;
    }
}
