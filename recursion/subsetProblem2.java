package recursion;

//import com.sun.source.doctreekpklp;.SeeTree;

import java.util.*;

public class subsetProblem2 {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        subset(0,arr,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    static void subset(int index, int[] arr,  ArrayList<Integer> total, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(total));
        for (int i = index; i < arr.length; i++) {
            if (i != index && arr[i] == arr[i - 1]) continue;
            total.add(arr[i]);
            subset(i + 1, arr, total, ans);
            total.remove(total.size() - 1);
        }
    }
}
