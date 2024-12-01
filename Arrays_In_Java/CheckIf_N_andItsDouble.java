package Arrays_In_Java;

import java.util.HashMap;

public class CheckIf_N_andItsDouble {
//    problem link: https://leetcode.com/problems/check-if-n-and-its-double-exist/?envType=daily-question&envId=2024-12-01
    public static boolean checkIfExist(int[]arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.size()!=0){
                if(map.containsKey(2*arr[i])){
                    return true;
                }
                else if(arr[i]%2==0 &&map.containsKey(arr[i]/2))return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]= {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }
}
