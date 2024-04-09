package SlidingWindow;

public class maxConsecutiveOnes {

    /*
    problem link: https://leetcode.com/problems/max-consecutive-ones-iii/description/

    Given a binary array nums and an integer k,
    return the maximum number of consecutive 1's in the array
    if you can flip at most k 0's.

        Example 1:
        Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
        Output: 6
        Explanation: [1,1,1,0,0,1,1,1,1,1,1]
        Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
     */

    static int longestONes(int[] nums, int k) {
        int l = 0, r = 0, len = 0, zeroes = 0;
        while (r < nums.length) {
            if (nums[r] == 0) zeroes++;

            while (zeroes > k) {
                if (nums[l] == 0) zeroes--;
                l++;
            }
            len = Math.max(len, r - l + 1);
            r++;
        }
        return len;
    }

    public static void main(String[] args) {
            int[]nums = {1,1,1,0,0,0,1,1,1,1,0};
            int k  =2;
            int len= longestONes(nums,k);
        System.out.println(len);
    }

}
