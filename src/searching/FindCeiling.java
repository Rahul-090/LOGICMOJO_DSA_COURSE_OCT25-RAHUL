package searching;

public class FindCeiling {
    public static void main(String[] args) {
        //ceiling is the element in an array greater than or equal to target
        /*
                2, 3, 5, 9, 14, 16, 18
                s        m          e

         */
        int [] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println("Find Ceiling: "+findCeiling(arr, 9));
    }

    public static int findCeiling(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ceiling = -1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(target > arr[mid]){
                start = mid +1;
            }else{
                ceiling = arr[mid];
                end = mid-1;
            }

        }
        return ceiling;
    }
}
