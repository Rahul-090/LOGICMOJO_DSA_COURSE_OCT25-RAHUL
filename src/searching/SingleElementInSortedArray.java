package searching;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int [] arr = {2};
        System.out.println("Single ele: "+singleEle(arr));
    }

    public static int singleEle(int [] arr){
        int n = arr.length;
        int start = 0;
        int end = n - 1;


        if(n == 1){
            return arr[0];
        }
        while(start <= end){
            int mid = (start+end)/2;


            if(mid == n-1 && arr[mid] != arr[n-2]){
                return arr[mid];
            }

            if(mid == 0 && arr[mid] != arr[1]){
                return arr[mid];
            }

            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }
            // 1, 2, 2, 3, 3
            //checking if mid index is even
            else if(mid%2==0){
                if(arr[mid] == arr[mid-1]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{//if mid is at odd index
                if(arr[mid] == arr[mid-1]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

//    public static int singleEle(int [] arr){
//
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start <= end){
//            int mid = (start+end)/2;
//            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
//                return mid;
//            }
//            //check whether mid is at even position
//            //if it is even then there will be even number of element in both side
//            //e.g.   [1, 2, 2, 3, 3]
//            //2 is at ind -> 2 therefore there will be even number of element on mis left and right
//            else if(mid%2 == 0){
//                if(arr[mid] == arr[mid-1]){
//                    end = mid - 1;
//                }else{
//                    start = mid + 1;
//                }
//            }else//if mid is at odd position there will be odd number in both sides
//            {
//                if(arr[mid] == arr[mid+1]){
//                    end = mid-1;
//                }else{
//                    start = mid+1;
//                }
//            }
//        }
//        return -1;
//    }
}
