package slidingWindow;

public class LongestSubarrayOfSumK {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 1, 1, 1, 1, 1};
        int k = 5;
        System.out.println("Longest Subarray of sum K: "+longestSubarray(arr, k));
    }

    public static int longestSubarray(int [] arr, int k){
        int i = 0;
        int j = 0;

        int n = arr.length;
        int maxLen = 0;
        int sum = 0;
        while(j < n){
            sum+=arr[j];

            if(sum < k){
                j++;
            }else if(sum == k){
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }else{
                while(sum > k){
                    sum-=arr[i];
                    i++;
                }
                j++;
            }
        }
        return maxLen;
    }
}
