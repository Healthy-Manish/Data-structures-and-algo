package Hashing;

import java.util.HashMap;
import java.util.List;

public class count_frequencies {

    static int hash(int[] arr,int target){
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for (int j : arr) {
            if (frequency.containsKey(j)) {
                frequency.put(j, frequency.get(j)+1);

            } else {
                frequency.put(j, 1);
            }
        }
        return frequency.get(target);
    }

    public static void main(String[] args) {
        int[] arr  = {10,5,10,15,10,5};
        System.out.println(hash(arr,10));
    }
}
