package Arrays_In_Java;

import java.util.HashMap;

public class subarray_with_atMost_K_frequency {
    /*
    https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/?envType=daily-question&envId=2024-03-28

     */

        public int maxSubarrayLength(int[] nums, int k) {
            int maxi =0;
            HashMap<Integer,Integer> map = new HashMap<>();
            int len =0;
            for(int i =0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                while(map.get(nums[i])>k){
                    map.put(nums[len],map.get(nums[len])-1);
                    len++;
                }
                maxi = Math.max(maxi,i-len+1);
            }
            return maxi;
        }

}
