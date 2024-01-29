package Arrays_In_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubarray {
//    Longest subarray with sum K

   static int longestSubarrayWithSumK(ArrayList<Integer> arr, long k){
       int left = 0;
       int right = 0;
       long sum = arr.get(0);
       int maxLen = 0;
       int n = arr.size();
       while (right<n){
           while (left<=right && sum>k){
               sum -= arr.get(left);
               left++;
           }
           if (sum ==k){
               maxLen = Integer.max(maxLen,right-left+1);

           }
           right++;
           if (right<n){
               sum+=arr.get(right);
           }
       }
       return maxLen;
   }
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>(Arrays.asList(1,2,1,1,1,3,3));
        long k= 6;
        System.out.println(longestSubarrayWithSumK(arr,k));
    }
}
