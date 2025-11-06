package searching;

public class SearchInRotatedSortedArrayOfDuplicateElement {
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Index"+searchInArray(arr, 1));
    }

    public static int searchInArray(int [] arr, int k){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] == k){
                return mid;
            }
            //for ascending part
            else if(arr[start] <= arr[mid]){
                if(arr[start] <= k && k <= arr[mid]){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }else{
                if(arr[mid] <= k && k <= arr[end]){
                    start = mid+1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;

    }
}


