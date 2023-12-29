package Arrays_In_Java;

import java.util.*;

public class union_sortedArray {

    static List<Integer> union (int[]arr1,int[]arr2){
        Set<Integer> set = new HashSet<>();
        for (int k : arr1) {
            set.add(k);
        }
        for (int j : arr2) {
            set.add(j);
        }
        List<Integer>lst = new ArrayList<>(set);
        Collections.sort(lst);
        return lst;
    }

    static List<Integer> Optimal_union (int[]arr1,int[]arr2) {
        List<Integer>lst = new ArrayList<>();
        int i = 0;
        int j= 0;
        while (i<arr1.length&&j<arr2.length){
            if (arr1[i]<=arr2[j]) {
                if (lst.isEmpty() || arr1[i] != lst.get(lst.size()-1)) {
                    lst.add(arr1[i]);

                }
                i++;
            }
            else {
                if (lst.isEmpty() || arr2[j] != lst.get(lst.size()-1)) {
                    lst.add(arr2[j]);

                }
                j++;
            }

        }

        while (i<arr1.length){
            if (lst.isEmpty() || arr1[i] != lst.get(lst.size()-1)) {
                lst.add(arr1[i]);

            }
            i++;
        }
        while (j<arr2.length){
            if (lst.isEmpty() || arr2[j] != lst.get(lst.size()-1)) {
                lst.add(arr2[j]);

            }
            j++;
        }
        return lst;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2  = {2,3,4,4,5,6};
        System.out.println(Optimal_union(arr1,arr2));
    }
}
