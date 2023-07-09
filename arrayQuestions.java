import java.util.Arrays;

public class arrayQuestions{
    public static void main(String[] args) {
        
        int[] arr = {1,3,22,56,78,990,54};
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }



    //swapping two numbers in java
    static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]=temp;
    }
    //finding max value in arr
    static int max(int[] arr){
       int maxval = arr[0];
       if(arr.length == 0)return -1;

       for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxval){
                maxval = arr[i];
            }

       }  
       return maxval;
    }
    
    //reversing an array
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(end>start){
            swap(arr, start, end);

            start++;
            end--;
        }

    }
}