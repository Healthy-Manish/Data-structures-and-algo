import java.util.Arrays;
import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        /*
        creating array with row and columns
         1 2 3
         4 5 6
         6 7 8         
         */

        //  int[][] arr = new int[3][3];//declaration of 2d arary
        int[][] arr = {{1,2,3},//0 index
                        {4,5,6},//1st index
                        {7,8,9}//2nd index
                         };

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(arr[1][2]);//accessing elements


        //taking input in 2D array
        Scanner sc = new Scanner(System.in);
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
     for(int[]a:arr2){
        System.out.println(Arrays.toString(a));
       
     }
}
}
