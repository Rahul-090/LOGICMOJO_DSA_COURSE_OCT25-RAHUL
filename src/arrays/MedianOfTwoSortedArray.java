package arrays;

public class MedianOfTwoSortedArray {
    public static void main(String [] args){
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};

        System.out.println("Median of Two sorted array: "+findMedianSortedArrays(nums1, nums2));
    }

    public static double  findMedianSortedArrays(int[] nums1, int[] nums2) {
        // List<Integer> mergedList = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        int [] mergedList = new int [n+m];
        int k = 0;
        int i = 0;
        int j = 0;

        while(i < nums1.length &&  j < nums2.length){
            if(nums1[i] < nums2[j]){
                mergedList[k] = nums1[i];
                i++;
                k++;
            }else{
                mergedList[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < n){
            mergedList[k] = nums1[i];
            k++;
            i++;
        }

        while(j < m){
            mergedList[k] = nums2[j];
            k++;
            j++;
        }

        if(mergedList.length%2 != 0){
            int ele = (0 + mergedList.length)/2;
            return (double) mergedList[ele];
        }else{
            int middle1 = mergedList[mergedList.length/ 2 - 1];
            int middle2 = mergedList[mergedList.length/ 2 ];
            return ((double) middle1 + (double) middle2) / 2.0;
        }

        // return -1;
    }
}
