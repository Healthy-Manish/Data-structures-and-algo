package SlidingWindow;

import java.util.HashMap;

public class FruitsIntoBasket {
     static int findMaxFruits(int []arr, int n) {
       /*
       There are ‘n’ fruit trees that are planted along a road. The trees are numbered from 0 to n-1. The type of fruit
        each tree bears is represented by an integer from 1 to 'n'.

        A Ninja is walking along that road. He has two baskets and wants to put the maximum number of fruits in them. The
        restriction is that each basket can have only one type of fruit.



        Ninja can start with any tree and end at any tree, but once he has started, he cannot skip a tree i.e if he picks fruit
         from the tree ‘i’, then he has to pick fruit from tree ‘i+1’ before going to the tree ‘i+2’. He will pick one fruit from each tree until he cannot, i.e, he will stop when he has to pick a fruit of the third type because only two different fruits can fill both baskets.



        You are given an array ‘arr’. The ‘i’th integer in this array represents the type of fruit tree ‘i’ bears. Return the
         maximum number of fruits Ninja can put in both baskets after satisfying all the conditions.



        For Example:
         'arr' = [1, 2, 3]

         Here, we have three different types of fruits. We can pick [1, 2] or [2, 3]. We can pick a maximum of two fruits.

        Hence, we return 2.
        */
        int l = 0,r = 0,maxlen=0;
         HashMap<Integer,Integer>map = new HashMap<>();
         while (r<arr.length) {
             map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

             if (map.size() > 2) {
                 int val=map.get(arr[l]);

                 if(val==1)
                 {
                     map.remove(arr[l]);
                 }
                 else
                 {
                     map.put(arr[l],val-1);
                 }
                 l++;
             }
             if (map.size() <= 2) {
                 maxlen = Math.max(maxlen, r - l + 1);
             }

             r++;
         }
         return maxlen;
    }

    public static void main(String[] args) {
         int[]arr = {1,1,2,3};
        int n = findMaxFruits(arr,4);
        System.out.println(n);
    }
}
