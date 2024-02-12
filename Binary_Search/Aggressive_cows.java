package Binary_Search;

import java.util.Arrays;

public class Aggressive_cows {
//    https://www.codingninjas.com/studio/problems/aggressive-cows_1082559?count=25&page=1&search=&sort_entity=order&sort_order=ASC
    static int agrresive(int[]arr,int cows){
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length-1]-arr[0];
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if (CanWePlace(arr,cows,mid)){
                ans= mid;
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    static boolean CanWePlace(int []arr, int cows,int dist){
        int last = arr[0];
        int cnt = 1;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]-last>=dist){
                cnt++;
                last = arr[i];
            }

        }
        if (cnt>=cows)return true;
        return false;
    }
}
