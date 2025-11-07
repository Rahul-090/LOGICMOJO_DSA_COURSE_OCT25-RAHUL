package sorting;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println("Find duplicate in range [1,n]: "+findDup(arr));
    }

    public static int findDup(int [] arr){
        int i = 0;
        int n = arr.length;
        while(i < n){
            int correctInd = arr[i]-1;
            if(arr[i] != arr[correctInd]) {
                int temp = arr[correctInd];
                arr[correctInd] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }

        for(int j =0; j <= n; j++){
            if(j != arr[j]-1){
                return arr[j];
            }
        }
        return -1;
    }
}
