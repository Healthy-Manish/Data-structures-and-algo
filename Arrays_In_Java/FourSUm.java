package Arrays_In_Java;

import java.util.*;

public class FourSUm {

//    --------------> BruteForce Apporach <---------------
    static List<List<Integer>> _4sum(int[]arr){
        Set<List<Integer>>set = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                HashMap<Integer,Integer>map = new HashMap<>();
                for (int k = j+1; k <arr.length ; k++) {
                    int sum = -(arr[i]+arr[j]+arr[k]);
                    if (map.containsKey(sum)){
                        List<Integer>temp = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k],sum));
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    map.put(arr[k],arr[k]);

                }
            }
        }
        return new ArrayList<>(set);
    }

//    ----------->Optimal Approach <----------

static List<List<Integer>>optimal(int[]arr,int target){
        Arrays.sort(arr);
        List<List<Integer>>ans= new ArrayList<>();
    for (int i = 0; i <arr.length ; i++) {
        if (i>0 && arr[i]==arr[i-1])continue;
        for (int j = i+1; j < arr.length; j++) {
            if (j>i+1 && arr[j]==arr[j-1])continue;
            int k = j+1;
            int l = arr.length-1;
            while (k<l){
                int sum = arr[i]+arr[j]+arr[k]+arr[l];
                if (sum>target){
                    l--;
                }
                else if (sum<target)k++;
                else {
                    List<Integer>temp = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                    ans.add(temp);
                    k++;
                    l--;
                    while (k<l && arr[k]==arr[k-1])k++;
                    while (k<l && arr[l]==arr[l+1])l--;
                }
            }
        }
    }
    return ans;
}

    public static void main(String[] args) {
        int[] arr = {1,2,-1,-2,2,0,-1};
        System.out.println(optimal(arr,0));
    }
}
