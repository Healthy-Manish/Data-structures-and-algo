import java.util.*;

public class linear_search2 {

    //searching in 2D array
    public static void main(String[] args) {
        int[][] arr = {
            {3,4,1},
            {5,6,8},
            {33,67,89,23}
        };
        int target = 67;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][]arr,int target){
        if(arr.length == 0)return new int[]{-1,-1} ;
        for(int i = 0;i<arr.length;i++){
            for(int j= 0;j<arr[i].length;j++){
                if(arr[i][j]==target)return new int[]{i,j};
            }

        }
        return new int[]{-1,-1} ;
    } 
}
