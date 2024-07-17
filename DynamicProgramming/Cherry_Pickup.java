package DynamicProgramming;

import OOPS.Access.A;

import java.util.Arrays;

public class Cherry_Pickup {
//  PROBLEM LINK: https://www.geeksforgeeks.org/problems/chocolates-pickup/1


    //recursive
    public int f(int[][] arr,int r,int j1,int j2){
        if(j1<0||j2<0||j1>=arr.length||j2>=arr.length)return Integer.MAX_VALUE;
        if(r==arr.length-1){
            if(j1==j2)return arr[r][j1];
            return arr[r][j1]+arr[r][j2];
        }
        int maxi = Integer.MIN_VALUE;
        for(int i =-1;i<=1;i++){
            for (int j = -1; j < 1; j++) {
                int a= 0;
                if (j1==j2){
                    a = arr[r][j1]+f(arr,r,j1+i,j2+j);
                }
                else a= arr[r][j1]+arr[r][j2]+f(arr,r,j1+i,j2+j);
                maxi = Math.max(maxi,a);
            }
        }
        return maxi;
    }

    //memoization
    public int f1(int[][] arr,int r,int j1,int j2,int[][][] dp) {
        if(j1<0||j2<0||j1>=arr[0].length||j2>=arr[0].length)return (int)(Math.pow(10,-9));
        if(r==arr.length-1){
            if(j1==j2)return arr[r][j1];
            return arr[r][j1]+arr[r][j2];
        }
        int maxi = Integer.MIN_VALUE;

        if(dp[r][j1][j2]!=-1)return dp[r][j1][j2];
        for(int i =-1;i<=1;i++){
            for (int j = -1; j <=1; j++) {
                int a= 0;
                if (j1==j2){
                    a = arr[r][j1]+f1(arr,r+1,j1+i,j2+j,dp);
                }
                else a= arr[r][j1]+arr[r][j2]+f1(arr,r+1,j1+i,j2+j,dp);
                maxi = Math.max(maxi,a);
            }
        }
        return dp[r][j1][j2]=maxi;
    }
    public int pickUp(int[][]arr,int n,int m){
        int dp[][][] = new int[n][m][m];


        for (int row1[][] : dp) {
            for (int row2[] : row1) {
                Arrays.fill(row2, -1);
            }
        }

        return f1(arr,0,0,m-1,dp);
    }
}
