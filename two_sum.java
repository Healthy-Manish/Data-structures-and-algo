import java.util.Arrays;
import java.util.HashMap;

public class two_sum {
    public static void main(String[] args) {
        //target = 8
        //arr= {1,7,2,3,4}
        //[1,7]
        int target = 10;
        int[] arr={1,7,2,3,4};
        int[]arr2 = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
             if (map.containsKey(target-arr[i])){
                 arr2[0]= map.get(target-arr[i]);

                 arr2[1]= i;
             }
             else {
                 map.put(arr[i],i);
             }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
