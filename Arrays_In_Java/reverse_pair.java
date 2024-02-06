package Arrays_In_Java;


import java.util.ArrayList;

public class reverse_pair {
    static int mergeSort(int[] arr,int low,int high){
        int cnt = 0;
        if (low>=high){
            return cnt;
        }
        int mid = (low+high)/2;
        cnt+=mergeSort(arr,low,mid);
        cnt+=mergeSort(arr,mid+1,high);
        cnt+=countPairs(arr,low,mid,high);
          merge(arr,low,mid,high);
        return cnt;
    }
    static int countPairs(int[]arr,int low,int mid,int high){
        int right = mid+1;
        int cnt =0;
        for (int i = low; i <=mid ; i++) {
            while (right<=high && arr[i]>(long)2*arr[right])right++;
            cnt+=(right-(mid+1));
        }
        return cnt;
    }
    static  void  merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while (left<=mid && right<=high){
            if (arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
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
    }

    public static void main(String[] args) {
        int[]arr = {4,1,2,3,1};
        int cnt = mergeSort(arr,0,arr.length-1);
        System.out.println(cnt);
    }
}
