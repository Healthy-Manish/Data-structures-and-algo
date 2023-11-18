package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    static List<List<Integer>> fourSum(int[] nums,int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null || nums.length==0){
            return res;
        }
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i <n ; i++) {
                if (i>0&& nums[i]==nums[i-1])continue;
            for (int j = i+1; j < n; j++) {
                if (j>i+1&&nums[j]==nums[j-1])continue;


//            two pointers
                int k = j+1;
                int l = n-1;
                while (k<l){
                    long sum = nums[i];
                    sum+= nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if (sum==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        res.add(temp);
                        k++;
                        l--;

                        // skip the duplicates:
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    }else if (sum<target)k++;
                    else l--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,3,4,4,2,1,2,1,1};
        int target = 9;
        System.out.println(fourSum(arr,target));
    }
}