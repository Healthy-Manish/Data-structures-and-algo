package Arrays_In_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class count_inversion {

    static int merge(int[]arr,int low,int high){
        int cnt = 0;
        if (low>=high){
            return cnt;
        }
        int mid = (high+low)/2;
        cnt+= merge(arr,low,mid);
         cnt+=merge(arr,mid+1,high);

       cnt+= mergeAll(arr,low,mid,high);
       return cnt;
    }
    static int  mergeAll(int[]arr,int low,int mid,int high){
        int right = mid+1;
        int left=low;
        int cnt = 0;
        ArrayList<Integer>temp = new ArrayList<>();
        while (left<=mid && right<=high){
            if (arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                cnt+=mid-left+1;
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <=high ; i++) {
            arr[i]=temp.get(i-low);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[]arr  = {5,3,2,1,4};
        int cnt = merge(arr,0,arr.length-1);
        System.out.println(cnt);
    }

}
