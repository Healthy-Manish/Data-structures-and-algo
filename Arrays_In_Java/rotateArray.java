package Arrays_In_Java;

import java.util.Arrays;

public class rotateArray {

//    rotating array by 1 position to left
    static int[]rotate(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]= arr[i];
        }
        arr[arr.length-1]=temp;

        return arr;
    }
//    rotating array by D places left

    static int[] rotateD(int[]arr,int d){
        d = d%arr.length;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i <arr.length ; i++) {
            arr[i-d]=arr[i];
        }
        int j = 0;
        for (int i = arr.length-d; i <arr.length ; i++) {
            arr[i]=temp[j];
            j++;
        }
        return arr;
    }
//    --------OPTIMAL APPROACH-----------

    static int[] optimal_reverse(int[]arr,int d){
        revers_array(arr,0,d-1);
        revers_array(arr,d,arr.length-1);
        revers_array(arr,0,arr.length-1);

        return  arr;
    }
    static void revers_array(int[]arr,int a, int b){
        while (a<=b){
            int temp = arr[a];
            arr[a]= arr[b];
            arr[b]= temp;
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(optimal_reverse(arr,4)));
    }
}
