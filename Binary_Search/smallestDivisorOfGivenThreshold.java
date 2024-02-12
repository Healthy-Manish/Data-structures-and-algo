package Binary_Search;

/*
problem link -
https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
 */
public class smallestDivisorOfGivenThreshold {
    static int maxi(int[]arr){
        int m = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            m=Math.max(m,arr[i]);
        }
        return m;
    }
    static int threshold(int[]arr,int t){
        int low = 1;
        int ans = 0;
        int high = maxi(arr);
        while (low<=high){
            int mid=low+(high-low)/2;
            if (sum(arr,mid)<=t){
                ans = mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    static int sum(int[]arr,int n){
        int  s = 0;
        for (int i = 0; i <arr.length ; i++) {
            s+= (int) Math.ceil((double) arr[i] /n);
        }
        return s;
    }
}
