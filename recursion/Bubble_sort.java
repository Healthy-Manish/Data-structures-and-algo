package recursion;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr ={4,3,2,6,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[]arr, int len, int c){
        if (len == 0)return;
        if (c<len){
            if (arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1]= temp;
            }
            bubble(arr,len,c+1);

        }
        else {
            bubble(arr,len-1,0);
        }

    }
}
