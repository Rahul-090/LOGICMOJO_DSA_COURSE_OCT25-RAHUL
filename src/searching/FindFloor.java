package searching;

public class FindFloor {
    public static void main(String[] args) {
        //floor is the just or closest smaller or equal element to target
        int [] arr = {2, 3, 5, 9, 14, 16, 18};
        //   2,  3,  5,  9,  14,  16,  18
        //   arr[mid] < target  // floor = mid;
        System.out.println("Floor of  target: "+findFloor(arr, 9));
    }

    public static int findFloor(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        int floor = -1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] < target ){
                floor = mid;
                start= mid+1;
            }else{
                end = mid-1;
            }
        }
        return arr[floor];

    }
}
