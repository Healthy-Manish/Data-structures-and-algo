package Arrays_In_Java;

import java.util.Arrays;

public class nextPermutation {
    /*
    given an array arr[] = {3,1,2}
    we have to give output the next permutation
    ex. 123 <132< 213< 231< 312< 321
    so the ans will be 3 2 1

    for [3 2 1] which is last we will fall back to first one i.e [1 2 3]
     */
    static int[] reverse(int[]arr,int s,int e){

        while (s<=e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]= temp;
            s++;
            e--;
        }
        return arr;
    }
    static int[] next(int[]arr){
        int n= arr.length;
        int ind = -1;
        for (int i = n-2; i >=0 ; i--) {
            if (arr[i]<arr[i+1]){
                ind = i;
                break;
            }
        }
        if (ind == -1){
            return reverse(arr,0,arr.length-1);
        }
        for (int i = n-1; i >=0 ; i--) {
            if (arr[i]>arr[ind]){
                int temp = arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
                break;
            }
        }
      return   reverse(arr,ind+1,n-1);
    }

    public static void main(String[] args) {
        int[] arr= {3,2,1};
        System.out.println(Arrays.toString(next(arr)));
    }
}
