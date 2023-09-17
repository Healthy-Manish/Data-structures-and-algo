package sorting_algo;

import javax.swing.*;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] arr = {3,9,7,12,34,32,16};
        insertion(arr);
        System.out.println(Arrays.toString(arr));


        //string and stringbuilder in java
    /*
    strings are immutable in java
    */
        String a = "kunal";
        String b = new String( "kunal");//here it is creating another object in stringpool
        System.out.println(a);
        System.out.println(a==b);
        System.out.println(a.equals(b));
        a = "manish";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.charAt(2));
         
    }
    static  void bubble(int[] arr){
        boolean swapp;
        for (int i = 0; i <arr.length ; i++) {
            swapp = false;
            for (int j = 1; j <arr.length-i ; j++) {
                if (arr[j]<arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                    swapp = true;

                }
            }
            if (!swapp)break;
        }
    }

    static void selection(int[] arr){
        //here we will pick a element and put it in right place

        for (int i = 0; i <arr.length ; i++) {
            int max = 0;

            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[max]){
                   max = j;

                }
                swap(arr,max,arr.length-i-1);

            }

        }
    }

    static void insertion(int[] arr){
        //time  complexity:
        //Worst case : 0(N^2)
        //Best case: 0(N)
        //for every index put that index element at the correct idnex of LHS
        for (int i = 0; i <arr.length-1 ; i++) {
            int j = i+1;
            while (j>0){
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
                j--;
            }
        }
    }
    static void swap(int[]arr,int a, int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }




}
