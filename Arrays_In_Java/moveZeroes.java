package Arrays_In_Java;

import java.util.Arrays;

public class moveZeroes {


    static int[] move_zeros(int[]arr){
        int j = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                j= i;
                break;
            }
        }
        if (j==-1)return arr;
        for (int i = j+1; i <arr.length ; i++) {
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {1,4,3,2,0,2,4,0,0,4,6};
        System.out.println(Arrays.toString(move_zeros(arr)));
    }
}
