package sorting_algo;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
         /*
       let we have an array  3,1,5,4,2
       bubble sort is also called sinking sort or exchange sort

          */
        int[]arr = {1,2,3,4,6,5};
         bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[]arr){
        boolean swapp;
        for (int i = 0; i <arr.length ; i++) {
             swapp= false;
            for (int j = 1; j <arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                    swapp = true;
                }
            }
            if (!swapp)break;
        }
    }
}
