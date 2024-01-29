package Arrays_In_Java;

import java.util.HashMap;

public class two_sum {
    static void twoSum(int[]arr,int target){
//      -------------> Using Hashmap <---------------

        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            int diff = target-arr[i];
            if (map.containsKey(diff)){
                System.out.println(map.get(diff)+" "+i);
                return ;
            }
            else {
                map.put(arr[i],i);
            }
        }
        System.out.println("NO");
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,7,9,6};
        int target = 10;
        twoSum(arr,target);
    }
}
