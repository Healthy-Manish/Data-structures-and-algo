package Hashing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
       return result;
    }
    public static void main(String[] args) {
        int[]nums = {2,5,1,7,9,10};
        System.out.println(Arrays.toString(twoSum(nums,14)));
    }
}
