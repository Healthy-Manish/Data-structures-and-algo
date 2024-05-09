package Graphs;

import java.util.ArrayList;

public class findProviance {
//    PROBLEM LINK : https://leetcode.com/problems/number-of-provinces/
    static void dfs(int node, ArrayList<ArrayList<Integer>>adjLs, int vis[] ){
        vis[node ]=1;
        for(Integer it: adjLs.get(node)){
            if(vis[it]==0){
                dfs(it,adjLs,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>>arr = new ArrayList<>();
        for(int i =0;i<isConnected.length;i++){
            arr.add(new ArrayList<>());
        }

        for(int i =0;i<isConnected.length;i++){
            for(int j =0;j<isConnected.length;j++){
                if(isConnected[i][j]==1&&i!=j){
                    arr.get(i).add(j);
                    arr.get(j).add(i);
                }
            }
        }
        int vis[]= new int[isConnected.length+1];
        int cnt =0;
        for(int i =0;i<isConnected.length;i++){
            if(vis[i]==0){
                cnt++;
                dfs(i,arr,vis);
            }
        }
        return cnt;
    }
}
