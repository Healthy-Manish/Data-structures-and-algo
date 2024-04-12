package SlidingWindow;

import java.util.HashMap;

public class SubarraysWith_K_DifferentIntegers {
    /*
    PROBLEM LINK: https://leetcode.com/problems/subarrays-with-k-different-integers/
    992. Subarrays with K Different Integers

        Given an integer array nums and an integer k, return the number of good
         subarrays of nums.

        A good array is an array where the number of different integers in that
         array is exactly k.

        For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
        A subarray is a contiguous part of an array.



        Example 1:

        Input: nums = [1,2,1,2,3], k = 2
        Output: 7
        Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]

     */
    public int atMost(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int i = 0, j = 0, n = nums.length, ans = 0;

        while (j < n) {
        map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
        while (map.size() > k && i <= j) {
            map.put(nums[i], map.get(nums[i]) - 1);
            if (map.get(nums[i]) == 0) map.remove(nums[i]);
            i++;
        }
        ans += (j - i + 1);
        j++;
    }
        return ans;
}
public int subarraysWithKDistinct(int[] nums, int k) {
    int ans = atMost(nums, k) - atMost(nums, k - 1);
    return ans;
}
}
