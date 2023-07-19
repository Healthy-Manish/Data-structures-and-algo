import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,7,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[]arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int j = i+1;
            while (j>0){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
                j--;
            }
        }
    }
    static void swap(int[]arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }
}
