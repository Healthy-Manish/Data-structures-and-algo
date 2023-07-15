import java.util.Arrays;

public class binary_2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,40},
                {15,25,43,45},
                {33,34,50,55,570}
        };
        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12,13},{21,23,45,67,89}};
//        System.out.println(Arrays.toString(search_2D(arr,45)));
        System.out.println(Arrays.toString(search(arr2,67)));
    }

    //searching in 2D array
    static int[] search_2D(int[][] arr, int target){
        // search in 2D array
        int r =0;
        int c = arr[r].length-1;

        while (r<arr.length&&c>=0){
            if (arr[r][c]==target){
                return new int[]{r,c};
            }
            if (arr[r][c]<target){
                r++;
                if (r<arr.length-1) {
                    c = arr[r].length - 1;
                }
                else return new int[]{-1,-1};

            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    //searching in strictly sorted array
    static int[] binary_search(int[]matrix,int rstart,int start,int end,int target){
        while (start<=end){
            int mid = start+(end-start)/2;
            if (matrix[mid]==target){
                return new int[]{rstart,mid};
            }
            if(matrix[mid]<target){
              start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return new int []{-1,-1};
    }
    static int[] search(int[][] matrix,int target) {
        int len = matrix.length-1;

        int rstart = 0;

        while (rstart<matrix.length){
            int rend= matrix[rstart].length-1;

            if(matrix[rstart][0]<= target&& target<=matrix[rstart][rend]){
                return  binary_search(matrix[rstart], rstart,0,matrix[rstart].length,target);
            }
            else if(target>matrix[rstart][rend]){
                rstart++;
            }
            if(target<matrix[rstart][0]) {
                if (rstart >= 0) {
                    rstart--;
                } else return new int[]{-1, -1};
            }

        }
        return new int[]{-1,-1};

    }
}
