package recursion;

import java.util.*;


/*
 40. Combination Sum II
Medium

Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.



Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output:
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output:
[
[1,2,2],
[5]
]

 */
public class combination_Sum2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2};

        int target = 4;
//        Set<List<Integer>>total = new HashSet<>();
//        subsequence(0,target,total,new ArrayList<>(),arr);
//        System.out.println(total);
        System.out.println(combinationSum(arr,target));


    }


    //BruteForce approach
    static void subsequence(int index,int target,Set<List<Integer>>total, ArrayList<Integer> ans, int[] arr) {
        if (index == arr.length) {
            if(target==0) {
                total.add(new ArrayList<>(ans));
            }
            return;
        }
        if (arr[index] <= target) {
            ans.add(arr[index]);
            subsequence(index+1 ,target-arr[index],total, ans, arr);
            ans.remove(ans.size() - 1);
        }

        subsequence(index+1 ,target,total, ans, arr);

    }
//Optimal approach

    static void findCombinations(int index, int[] arr,int target, List<List<Integer>> total, List<Integer>ans) {

            if (target == 0) {
                total.add(new ArrayList<>(ans));

                return;
            }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ans.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], total, ans);
            ans.remove(ans.size()-1);
        }

    }
    static List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>>total = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0,candidates,target,total,new ArrayList<>());

        return total;
    }
}



