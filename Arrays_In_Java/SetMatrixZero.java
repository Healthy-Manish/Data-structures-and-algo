package Arrays_In_Java;
import java.util.*;
import java.util.Arrays;

public class SetMatrixZero {
//    if any element of a matrix of m x n size is zero
//    then mark all elements of its row and column as zero
    static void setZero(int[][]arr,int r, int c){
        int[] rows = new int[r];
        int[] cols = new int[c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                if (arr[i][j]==0){
                    rows[i]=1;
                    cols[j]= 1;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (rows[i]==1||cols[j]==1){
                    arr[i][j]= 0;
                }
            }
        }

    }
    static void setZeros(int[][]matrix){
        ArrayList<Integer>r = new ArrayList<>();
        ArrayList<Integer>c = new ArrayList<>();
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }

            }
        }
        for(int row : r){
            for(int i = 0;i<matrix[0].length;i++){
                matrix[row][i]= 0;
            }
        }
        for(int col : c){
            for(int i = 0;i<matrix.length;i++){
                matrix[i][col]= 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},{1,0,1,1},{1,1,0,1},{1,0,0,1}};
        int r= arr.length;
        int c= arr[0].length;
        System.out.println("initial array");
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        setZero(arr,r,c);
        System.out.println("final array");
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
