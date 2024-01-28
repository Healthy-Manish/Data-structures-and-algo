package Arrays_In_Java;

import java.util.HashMap;

public class majority_element {
//    display the element that apperar more than N/2 times where n is the
//    length of array
    static int majorityElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        for (Integer key: map.keySet()){
            if (map.get(key)>arr.length/2){
                return key;
            }
        }
        return -1;
    }
//    ----------> More's Voting Algorithm <---------------

 static int majorityElement2(int[] arr){
        int cnt = 0;
        int el= 0;
     for (int i = 0; i <arr.length ; i++) {
         if (cnt == 0){
             el= arr[i];
         }
         else if (arr[i]==el) {
             cnt++;

         }
         else {
             cnt--;
         }
     }
     int cnt1 =0;
     for (int i = 0; i <arr.length ; i++) {
         if (arr[i]==el)cnt1++;
     }
     if (cnt1>arr.length/2)return el;

     return -1;
 }
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,1,2,2};
        System.out.println(majorityElement2(arr));
    }
}
