package slidingWindow;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int [] arr = {100, 200, 300, 400};
        int k = 2;
        System.out.println("Max Sum :"+ maxSumSubarrayOfSizeK(arr, k));
    }

    public static int maxSumSubarrayOfSizeK(int [] arr, int k){
        int i = 0;
        int j = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        int sum =0;
        while(j < n){
             sum+=arr[j];
            if(j-i+1 == k){
                maxSum = Math.max(maxSum, sum);
                sum-=arr[i];
                i++;
                j++;
            }else{
                j++;
            }
        }
        return maxSum;
    }

}
