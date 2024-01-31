package Arrays_In_Java;

import java.util.HashMap;

public class CountSubarraySumEqualToK {
    static int cntsubarraysum(int[]arr,int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int preSum = 0,cnt =0;
        for (int i = 0; i <arr.length ; i++) {
            preSum+=arr[i];
            int remove= preSum-k;
            if (map.containsKey(remove)) {
                cnt += map.get(remove);
            }
            if (map.containsKey(preSum)) {
                map.put(preSum, map.get(preSum) + 1);
            }
            else {
                map.put(preSum,1);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,-3,1,1,1,4,2,-3};
        System.out.println(cntsubarraysum(arr,3));
    }
}
