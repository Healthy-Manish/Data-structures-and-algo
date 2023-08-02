package sorting_algo;

import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        //internal sorting algorithm
        int[]arr2 = {6,7,5,4,8,3,2,1};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    /*
    In quick sort we pick a random element and make it pivot
    then we'll compare with all elements
    if element is smaller than pivot than put it on left side
    else put it at right hand side in the array

    Time complexity of this algorithm is O(N^2) in worst case
    Quick sort is not stable
     */
    static void  sort(int[] arr, int low, int high){
        if(low>=high)return;

        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = arr[m];
        while (s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s]= arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);
    }

}

