package sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {3, 0, 1};
        System.out.println("Missing Number: "+missingNumber(arr));
    }

    public static int missingNumber(int [] arr){
        int i = 0;
        int n = arr.length;

        while(i < n){
            int correctIndex = arr[i];
            if(arr[i] < n && arr[correctIndex] != arr[i]){
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }

        for(int j = 0; j < n; j++){
            if(arr[j] !=  j){
                return j;
            }
        }
        return n;
    }
}
