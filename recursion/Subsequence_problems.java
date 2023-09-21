package recursion;

import java.util.ArrayList;

public class Subsequence_problems {
    public static void main(String[] args) {
        /*
        A subsequence is a contigous /non-contigous sequence , which
        follows the order.

        A sub array is contigous but a subsequence can be contigous/non-contigous

        EX - arr = [3,1,2]
        subsequences = [] [3] [1] [2] [3,1] [1,2] [3,2] [3,1,2]
        here we can see that [3,2] is not contigous but is in subsequence

        time complexity is :O( 2^N *N)
        space complexity is : O(n)
         */
        int[] arr = {3,1,2};
        ArrayList<Integer> ans = new ArrayList<>();

        subsequence(0,ans,arr,arr.length);
    }

    static void subsequence(int index, ArrayList<Integer> ans, int[] arr,int length){
        if (index == length){
            System.out.println(ans);
            return;
        }
        ans.add(arr[index]);
        subsequence(index+1,ans,arr,length);
        ans.remove(ans.size()-1);
        subsequence(index+1,ans,arr,length);
    }

}
