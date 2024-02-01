package Arrays_In_Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majority_element2 {
//    find the elements in the array whose occurrence is greater than N/3 where N is array length
    static List<Integer> majority(int[]arr){
        HashMap<Integer,Integer>map = new HashMap<>();
        List<Integer> ans  = new ArrayList<>();
        int min= (arr.length/3)+1;

        for (int i = 0; i <arr.length ; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                if (map.get(arr[i])==min)ans.add(arr[i]);
            }
            else {
                map.put(arr[i],1);
            }
        }
        return ans;
    }
    static List<Integer> optimal(int[]arr){
        int cnt1 = 0,cnt2= 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (cnt1==0 && ele2!=arr[i]){
                ele1 = arr[i];
                cnt1 = 1;
            }
            else if (cnt2 ==0 && ele1!=arr[i]) {
                ele2 = arr[i];
                cnt2 = 1;
            }
            else if (arr[i]==ele1) {
                cnt1++;
            } else if (arr[i]==ele2) {
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }

        }
        List<Integer>ans = new ArrayList<>();
        cnt1 = 0;
        cnt2= 0;
        for (int i = 0; i <arr.length ; i++) {
            if (ele1==arr[i])cnt1++;
            if (ele2==arr[i])cnt2++;
        }
        int max = (arr.length/3)+1;
        if (cnt1>=max)ans.add(ele1);
        if (cnt2>=max)ans.add(ele2);
        return ans;
    }


    public static void main(String[] args) {
        int[]ans = {1,1,1,1,2,2,2,3,3,2};
        System.out.println(optimal(ans));
    }
}

