package Arrays_In_Java;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    static int consecutive(int[]nums){
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int n = nums.length;
        int last = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;
        for(int i = 0;i<n;i++){
            if(nums[i] -1 == last){
                cnt+=1;
                last = nums[i];
            }
            else if(last!=nums[i]){
                cnt=1;
                last = nums[i];
            }
            longest = Integer.max(longest,cnt);
        }
        return longest;
    }
    static int optimal(int[]arr){
        if (arr.length==0)return  0;
        HashSet<Integer> set= new HashSet<>();
        for (int num : arr){
            set.add(num);
        }
        int maxi = 1;
       for(int ele :set){
           if (!set.contains(ele-1)){
               int cnt = 1;
               int temp = ele;
               while (set.contains(temp+1)){
                   cnt++;
                   temp= temp+1;
               }
               maxi = Integer.max(maxi,cnt);
           }
       }
        return maxi;
    }
}
