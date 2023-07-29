package recursion;

import java.util.Arrays;

public class Heap_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[]arr,int len,int c,int max){

        if (c==len)return;


        if(c<len){
            if (arr[c]>arr[max]){

                selection(arr,len,c+1,c);
            }

        }else {
            int temp = arr[max];
           arr[max]= arr[len-1] ;
            arr[len-1]= temp;
            selection(arr,len-1,0,0);
        }
    }
}
