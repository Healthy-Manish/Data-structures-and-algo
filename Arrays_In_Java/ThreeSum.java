package Arrays_In_Java;

import java.util.*;

public class ThreeSum {
//    given an array  return the triplets which sums to zero the triplets should not be repeated and the elements
//    inside shouldn't be duplicate

//    ----------> BruteForce Approach <--------------
    static List<List<Integer>> triplets(int[]arr){
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==0){
                        List<Integer>temp = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k]));
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);

        return ans;
    }

//    ------------> Better Approach <-----------------
static List<List<Integer>> tripletsBetter(int[]arr){
    Set<List<Integer>>ans = new HashSet<>();
    for (int i = 0; i <arr.length ; i++) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int j = i+1; j <arr.length ; j++) {
            int ele = -(arr[i]+arr[j]);
            if (map.containsKey(ele)){
                List<Integer>temp = new ArrayList<>(Arrays.asList(arr[i],arr[j],ele));
                Collections.sort(temp);
                ans.add(temp);
            }
                map.put(arr[j],arr[j]);

        }
    }


    return new ArrayList<>(ans);
}

//----------> Optimal Approach <--------------
    static List<List<Integer>> optimal(int[]arr){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (i>0 && arr[i]==arr[i-1])continue;
            int j= i+1;
            int k = arr.length-1;
            while (j<k){
                int sum = arr[i]+arr[j]+arr[k];

                if (sum>0){
                    k--;
                }
                else if (sum<0){
                    j++;
                }
                else {
                    ans.add(new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k])));
                    j++;
                    k--;
                    while (arr[j]==arr[j-1])j++;
                    while (arr[k]==arr[k+1])k--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr = {-1,0,1,2,-1,-4};
        System.out.println(optimal(arr));
    }
}