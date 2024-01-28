package Arrays_In_Java;

import java.util.Arrays;

public class sortArrayOf {
//    sort an array of 0s 1s and 2s
//    Dutch National Flag Algorithm
    static void sortArray(int[] arr, int n ){
        int low = 0,mid =0,high = n-1;
        while (mid<=high){
            if (arr[mid]==0){
                int temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }

    }


    public static void main(String[] args) {
        int[]arr = {0,1,0,1,1,1,0,0,2,1,2,2,0,2,1};
        int n = arr.length;
        sortArray(arr,n);
        System.out.println(Arrays.toString(arr));

    }
}
