package SlidingWindow;

public class numsSubarraysWIthSum{
    /*
    PROBLEM LINK: https://leetcode.com/problems/binary-subarrays-with-sum/description/
    Given a binary array nums and an integer goal, return the number\
     of non-empty subarrays with a sum goal.

    A subarray is a contiguous part of the array.



    Example 1:

    Input: nums = [1,0,1,0,1], goal = 2
    Output: 4
    Explanation: The 4 subarrays are bolded and underlined below:
    [1,0,1,0,1]
    [1,0,1,0,1]
    [1,0,1,0,1]
    [1,0,1,0,1]
     */
    static int findNumber(int[]nums,int goal){
        int l =0,r=0,sum = 0, cnt =0;
        if(goal<0)return 0;

        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
    static int findSUm(int[] nums, int goal) {

        return findNumber(nums,goal)-findNumber(nums,goal-1);

    }

    public static void main(String[] args) {
        int[]nums = {1,0,1,0,1};
        int goal = 2;
        int num = findSUm(nums,goal);
        System.out.println(num);
    }

}
