package Arrays_In_Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class leaderInTheArray {
    /*
    arr[] = {10,22,12,3,0,6}
    leaders in the array are = {22,12,6} as there are element in the right
    of these elements which are smaller then them
     */
    static ArrayList<Integer> Leader(int[]arr){
        int max =Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = arr.length-1; i >= 0; i-- ){
            if (arr[i]>max){
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[]arr = {10,22,12,3,0,6};
        ArrayList<Integer> result = Leader(arr);
        System.out.println(result);
    }
}
