package recursion;
import java.util.*;
public class permutation_with_Recursion {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recurPermute_Approach1(nums,ds,ans,freq);
//        System.out.println(ans);
        List<List<Integer>> ans2 = new ArrayList<>();

        recurPermute_Approach2(0,nums,ans2);
        System.out.println(ans2);
    }

    static void recurPermute_Approach1(int[] nums , List<Integer>ds, List<List<Integer>> ans, boolean[] freq){
        if (ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                recurPermute_Approach1(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }

    //Approach -2 (Space Optimized approach
    static void recurPermute_Approach2(int index,int[] nums, List<List<Integer>> ans){
        if (index == nums.length){
            List<Integer>ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i <nums.length ; i++) {
            swap(i,index,nums);
            recurPermute_Approach2(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
    static void swap(int i ,int j, int[] nums){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }
}
