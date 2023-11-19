package Hashing;

import java.util.HashMap;

public class LargestSubarrayWithSumZero {
        static int longestSubarray(int[] nums){
            HashMap<Integer,Integer>hashSet = new HashMap<>();
            int maxi = 0;
            int sum = 0;
          for (int i = 1;i<nums.length;i++) {
              sum+= nums[i];
              if (sum == 0)maxi=i+1;
              else{
                  if (hashSet.get(sum)!=null){
                      maxi = Math.max(maxi,i-hashSet.get(sum));
                  }
                  else {
                      hashSet.put(sum,i);
                  }
              }
          }
        return maxi;
    }

}
