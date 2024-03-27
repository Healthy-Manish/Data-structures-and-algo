package Arrays_In_Java;

public class count_subarray_sum_less_than_K {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt =0;
        if(k<=1)return 0;
        int left =0,right =0,product =1;
        int n = nums.length;
        while(right<n){
            product = product*nums[right++];
            while(product>=k && right>left){
                product =product/nums[left++];
            }

            if(product<k)cnt+=right-left;

        }
        return cnt;
    }
}
