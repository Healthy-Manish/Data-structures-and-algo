package Arrays_In_Java;

import java.util.Arrays;

public class merge_two_sorted_array {
    static void merge(int[]arr1,int[]arr2,int n,int m){
        int left =0;
        int right = 0;
        int ind = 0;
        int[]arr3 = new int[m+n];
        while (left<n && right<m){
            if (arr1[left]<=arr2[right]){
                arr3[ind]=arr1[left];
                left++;ind++;
            }
            else {
                arr3[ind]=arr2[right];
                right++;ind++;
            }
        }
        while (left<n){
            arr3[ind++]=arr1[left++];
        }
        while (right<m){
            arr3[ind++]=arr2[right++];
        }

        for (int i = 0; i <m+n ; i++) {
            if (i<n)arr1[i]=arr3[i];
            else arr2[i-n]=arr3[i];
        }
    }

//    -------> getting rid of extra space
    static void optimal(int[]arr1,int[]arr2,int n,int m){
        int left = n-1;
        int right =0;
        while (left>=0 && right<m){
            if (arr1[left]>arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }
            else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }


    public static void main(String[] args) {
        int[]arr = {1,2,3,0,0,0};
        int[]arr2= {2,5,6};

        System.out.println(Arrays.toString(arr));
    }

}
