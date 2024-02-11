package Binary_Search;
/*
problem link-
https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
 */
public class CapacityToShipPakages {
    static int maxi(int[]arr){
        int m = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            m=Math.max(m,arr[i]);
        }
        return m;
    }
    static int total(int[]arr){
        int t = 0;
        for (int j : arr) {
            t += j;
        }
        return t;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low = maxi(weights);
        int high = total(weights);
        int ans = 0;
        while (low<=high){

            int mid = low+(high-low)/2;
            int est  = maxdays(weights,mid);
            if (est <=days){
                ans = mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    static int maxdays(int []arr,int w){
        int days = 1;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if (sum+arr[i]>w){
                sum = arr[i];
                days+=1;
            }
            else sum+=arr[i];
        }
        return days;
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(arr,5));
    }
}
