package Arrays_In_Java;

import java.util.ArrayList;

public class SpiralTraversalInMatrix {

    static ArrayList<Integer> spiralTraversal(int[][]arr){
        ArrayList<Integer>ans = new ArrayList<>();
        int r = arr.length;
        int c= arr[0].length;
        int left = 0,right = c-1;
        int top = 0,bottom = r-1;
//        time complexity: O(N*N)
        while (top<=bottom && left<=right){
            for (int i = left; i <=right ; i++) {
                ans.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                ans.add(arr[i][right]);
            }
            right--;
            if (top<=bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }

                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        ans.add(arr[i][left]);
                    }
                    left++;
                }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[][]arr = {
                {1,2,3,4},
                {12,13,14,5},
                {11,16,15,6},
                {10,9,8,7}
        };
        System.out.println(spiralTraversal(arr));
    }

}
