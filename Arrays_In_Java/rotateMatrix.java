package Arrays_In_Java;

public class rotateMatrix {
    static int[][]spiralTraversal(int[][]arr){
        int r = arr.length;
        int c= arr[0].length;
        int len = arr.length-1;
        int[][]ans = new int [r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][len-i]=arr[i][j];
            }
        }
        return ans;
    }

    static int[][] optimal(int[][]arr){
//    step-1 :find transpose of matrix
//        step-2: reverse each row of 2D matrix
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;

            }
        }
        for (int i = 0; i <arr.length ; i++) {
            reverse(arr[i]);
        }
        return arr;
    }
    static void reverse(int[]arr){
        int s = 0;
        int e =arr.length-1;
        while (s<=e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int[][]arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[][]ans = optimal(arr);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
