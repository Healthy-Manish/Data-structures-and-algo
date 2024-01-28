package Arrays_In_Java;

import java.util.Arrays;

public class Missing_Num {
    public static void main(String[] args) {
        int[]arr = {1,4,5,3,6};
//        cyclicSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]!=i+1){
//                System.out.println(i+1);
//                break;
//            }
//        }

//        ------------> OPTIMAL APPROACH  <---------------
        int xor1=0;
        int xor2 =0;
        for (int i = 0; i <arr.length ; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1^arr.length+1;
        xor1= xor2^xor1;
        System.out.println(xor1);
    }

    static void cyclicSort(int[] arr){
        int size= arr.length;
        int i = 0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]<arr.length && arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i]=arr[correct];
                arr[correct]= temp;
            }
            else {
                i++;
            }
        }
    }
}
