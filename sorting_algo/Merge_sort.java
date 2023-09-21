package sorting_algo;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_sort {
     /*
        1.Divide array in two parts
        2.Get bot parts sorted via recursion
        3.Merge two sorted parts.
        time complexity of this algorithm is O(N*logN)
        space complexity : O(n)
     */
     public static void main(String[] args) {
         int[] arr = {3,2,1,5,7,6};
         mergeSort(arr,0,arr.length-1);
         System.out.println(Arrays.toString(arr));
     }
    static void mergeSort(int[] arr,int low,int high){
         if (low==high){
             return ;
         }
         int mid = (low+high)/2;
         mergeSort(arr,low,mid);
         mergeSort(arr,mid+1,high);

         merge(arr,low,mid,high);
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

}
