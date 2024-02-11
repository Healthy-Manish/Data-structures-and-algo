package Binary_Search;

public class Min_number_ofBouquets {
    /*
    problem link-
    https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
     */
    static int minElement(int[]arr){
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            m=Math.min(m,arr[i]);
        }
        return m;
    }
    static int maxElement(int[]arr){
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            m=Math.max(m,arr[i]);
        }
        return m;
    }
    static int minDays(int[]bloomDay,int m,int k){
         int low = minElement(bloomDay);
         int high = maxElement(bloomDay);
         int ans =0;
         if (bloomDay.length<(long)m*k)return -1;
         while (low<=high){
             int mid = low +(high-low)/2;
             if (possible(bloomDay,m,k,mid)){
                 ans =mid;
                 high=mid-1;
             }
             else {
                 low=mid+1;
             }
         }
         return ans;
    }
    static boolean possible(int[]arr,int m,int k,int mini){
         int cnt =0;
         int ans =0;
        for (int j : arr) {
            if (j <= mini) {
                cnt++;
            } else {
                ans += (cnt / k);
                cnt = 0;
            }
        }
        ans+=(cnt/k);
        return ans >= m;
    }

    public static void main(String[] args) {
        int[]arr = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;
        System.out.println(minDays(arr,m,k));
    }
}
