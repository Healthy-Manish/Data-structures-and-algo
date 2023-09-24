package recursion;
import java.util.*;
public class combination_sum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        ArrayList<Integer> ans = new ArrayList<>();
        int target = 8;
        List<List<Integer>>total = new ArrayList<>();
        subsequence(0,target,total,ans,arr,arr.length);
        System.out.println(total);
    }
    static void subsequence(int index,int target,List<List<Integer>>total, ArrayList<Integer> ans, int[] arr, int length) {
        if (index == length) {
            if(target==0) {
                total.add(new ArrayList<>(ans));
            }
            return;
        }
        if (arr[index] <= target) {
            ans.add(arr[index]);
            subsequence(index ,target-arr[index],total, ans, arr, length);
            ans.remove(ans.size() - 1);
        }

        subsequence(index+1 ,target,total, ans, arr, length);

    }
}

