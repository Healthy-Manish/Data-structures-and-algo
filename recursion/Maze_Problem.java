package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze_Problem {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[][] obstacle = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
//        allpath("", obstacle, 0, 0);
        int[][]path = new int[obstacle.length][obstacle[0].length];
        printPathArray("",obstacle,0,0,path,1);
    }


    static int count(int r, int c) {
        if (r == 1 || c == 1) return 1;
        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    //printing the paths of the problem
    static void countPath(int r, int c, String ans) {

        if (r == 1 && c == 1) {
            System.out.println(ans);
            return;
        }

        if (r > 1) {
            countPath(r - 1, c, ans + 'D');
        }
        if (c > 1) {
            countPath(r, c - 1, ans + 'R');
        }
    }

    static void pathRestriction(String str, int[][] arr, int r, int c) {
        if (r == arr.length - 1 && c == arr[0].length - 1) {
            System.out.println(str);
            return;
        }
        if (arr[r][c] == 1) return;

        if (r < arr.length - 1) {
            pathRestriction(str + 'D', arr, r + 1, c);
        }
        if (c < arr[0].length - 1) {
            pathRestriction(str + 'R', arr, r, c + 1);
        }

//            Moving in all  directions i.e left right up down

    }

    static void allpath(String str, int[][]arr, int r, int c) {
        if (r == arr.length - 1 && c == arr[0].length - 1) {
            System.out.println(str);
            return;
        }
        if (arr[r][c] == 1) return;
        arr[r][c] = 1;

        if (r < arr.length - 1) {
            allpath(str + 'D', arr, r + 1, c);
        }
        if (c < arr[0].length - 1) {
            allpath(str + 'R', arr, r, c + 1);
        }
        if (r>0){
            allpath(str+'U',arr,r-1,c);
        }
        if (c>0){
            allpath(str+'L',arr,r,c-1);
        }
        arr[r][c]=0;
    }

    static void printPathArray(String str, int[][]arr, int r, int c,int[][]path,int step) {
        if (r == arr.length - 1 && c == arr[0].length - 1) {
            path[r][c]=step;
            for(int[]result:path){
                System.out.println(Arrays.toString(result));
            }
            System.out.println(str);
            System.out.println();
            return;
        }
        if (arr[r][c] == 1) return;
        arr[r][c] = 1;
        path[r][c]=step;
        if (r < arr.length - 1) {
            printPathArray(str + 'D', arr, r + 1, c,path,step+1);
        }
        if (c < arr[0].length - 1) {
            printPathArray(str + 'R', arr, r, c + 1,path,step+1);
        }
        if (r>0){
            printPathArray(str+'U',arr,r-1,c,path,step+1);
        }
        if (c>0){
            printPathArray(str+'L',arr,r,c-1,path,step+1);
        }
        arr[r][c]=0;
        path[r][c]=0;
    }
}