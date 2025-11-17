package arrays;

public class MaximumSubarraryKadane {
    public static void main(String[] args){
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: "+maximumSubarraySumKadane(arr));
    }

    public static int maximumSubarraySumKadane(int [] arr){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(sum < 0){
                sum = 0;
            }
            sum+=arr[i];
            maxi = Math.max(sum, maxi);

        }
        return maxi;
    }
}
