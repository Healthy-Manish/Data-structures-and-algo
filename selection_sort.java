import java.lang.reflect.Array;
import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3, 6,-34};
//        System.out.println(maxlength(arr, 0, arr.length));
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxindex = maxlength(arr,0,last);
            swap(arr,maxindex,last);
        }
    }

    static int maxlength(int[] arr, int first, int last) {
        int max = first;
        for (int i = 0; i <=last; i++) {
            if (arr[i] > arr[max]) max = i;
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}
