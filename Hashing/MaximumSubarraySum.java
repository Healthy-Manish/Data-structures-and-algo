package Hashing;

public class MaximumSubarraySum {

//    Kadane's Algorithm
    public static int maxSubArray(int[]nums){
        int sum = 0;
        int maxi = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            sum += nums[i];
            if (sum>maxi)maxi= sum;
            if (sum<0) sum = 0;
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubArray(nums));
    }
}
