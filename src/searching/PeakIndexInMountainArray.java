package searching;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 7, 6, 3, 2};
        /*

         */
        System.out.println("Peak Index: "+peakIndex(arr ));
    }

    public static int peakIndex(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start+(end-start)/2;

            if(arr[mid] > arr[mid+1]){
                //you are in descending part and you have to go to start of this descending order
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }

}
