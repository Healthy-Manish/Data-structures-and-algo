package sorting_algo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice2 {

    //cyclic sort
    //when given number from range 1 to n use cyclic sort
    public static void main(String[] args) {
        int [] arr= {4,3,2,7,8,2,3,1};
        int[] miss = {3,0,1,2,5 };
        int[] nums = {1,1};
        int[] nums2 = {1,2,0};
        System.out.println(firstpositivemissing(nums2));
        System.out.println(Arrays.toString(findErrorNums(nums)));
//        System.out.println(missing(miss));
        System.out.println(disappearedarray(arr));
    }

    static  void cyclicsort(int[] arr){
       int i = 0;
       while (i<arr.length){
           int correct = arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
       }
    }


    static void swap(int[]arr,int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int missing(int[]arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[correct]){

                swap(arr,i,correct);


            }
            else {
                i++;
            }
        }

        for (int j = 0; j<arr.length ; j++) {
            if (arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }

    static List<Integer> disappearedarray(int[]arr){
        ArrayList<Integer>list = new ArrayList<>();
        int i = 0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]){

                swap(arr,i,correct);


            }
            else {
                i++;
            }
        }
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j]!=j+1){
                list.add(j+1);
            }
        }

        return list;
    }
    static int[] findErrorNums(int[] nums){
        int[] arr = {-1,-1};
        int i = 0;
        while (i<nums.length){
            int correct =  nums[i]-1;
            if (nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }
           else i++;
        }
        for (int j = 0; j <nums.length ; j++) {
            if (nums[j]!=j+1){
                arr[0]=nums[j];
                arr[1] = j+1;
            }
        }
        return arr;
    }

    static int firstpositivemissing(int[]arr ){
        int i = 0;
        while (i<arr.length){
            int correct =  arr[i]-1;
            if (arr[i]<=arr.length && arr[i]>0 && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else i++;
        }
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j]!=j+1){
                return j+1;
            }

        }
        return arr.length+1;
    }
}
