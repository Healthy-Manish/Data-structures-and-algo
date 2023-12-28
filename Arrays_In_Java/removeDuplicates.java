package Arrays_In_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        // Write your code here.
       int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr.get(i)!=arr.get(j)){
                arr.set(++i,arr.get(j));
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>(Arrays.asList(1,2,2,2,3));
        System.out.println(removeDuplicates(arr,arr.size()));
    }
}
