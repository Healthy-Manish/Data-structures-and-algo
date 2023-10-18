package recursion;

public class target_sum {
    public static void main(String[] args) {
        int[]nums = {1,1,1,1,1};
        int target = 3;
        System.out.println(targetSum(nums,target,0,0));

          }
    static int targetSum(int[] nums,int target,int i ,int total){
          if( i ==nums.length) {
              if (target == total) {
                  return 1;
              }
              return 0;
          }

        int h = targetSum(nums,target,i+1,total-nums[i]);
          int j = targetSum(nums,target,i+1,total+nums[i]);

          return h+j;


    }
}
