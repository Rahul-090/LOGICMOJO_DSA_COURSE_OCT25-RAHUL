package searching;

public class FindPositionOfAnElementInASortedArrayOfInfiniteNumbers {
    public static void main(String[] args) {
        int [] arr = {1, 23, 45, 67, 89, 98};
        System.out.println("Find in Infinite number: "+findEle(arr, 98));
    }

    public static int findEle(int [] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int tempStart = end+1;

            end = end+(end-start+1)*2;
            start =tempStart;
        }

        return binarySearch(arr, start, end, target);
    }

    public static int binarySearch(int [] arr, int start, int end, int target){

        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }else{
                end = mid-1;
            }

        }
        return -1;
    }
}
