package Arrays_In_Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountSubarrayXOR_equal_K {
    /*
    int arr[] = {4,2,2,6,4};
    return xor suarrays equal to 6
    subarrays are:
    {4,2}
    {6}
    {2,2,6}
    {4,2,2,6,4}
     */

    static List<List<Integer>> generateSubarray(int[]arr,int k){
        List<List<Integer>>ans = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            int xor = 0;
            List<Integer>temp = new ArrayList<>();
            for (int j =i; j <arr.length ; j++) {
                temp.add(arr[j]);
                xor= xor^arr[j];
                if (xor==k){
                   List<Integer>append = new ArrayList<>(temp);
                   ans.add(append);
                }
            }

        }
        return ans;
    }

    static int optimal(int[]arr,int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int xor = 0;
        int cnt = 0;
        for (int i = 0; i <arr.length ; i++) {
            xor = xor^arr[i];
            int diff = xor^k;
            if (map.containsKey(diff)){
                cnt+=map.get(diff);

            }
            if (map.containsKey(xor)){
                map.put(xor,map.get(xor)+1);
            }
            else {
                map.put(xor,1);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[]arr = {4,2,2,6,4};
        System.out.println(optimal(arr,6));
    }
}
