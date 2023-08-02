package sorting_algo;

import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
       int[]arr = {3,5,2,1,4};
       cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i]-1;

            if(arr[i]!= arr[correct]){
                    swapp(arr,i,correct);
            }
            else i++;
        }
    }
    static  void swapp(int[]arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }


}
