package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class pair{
    int pos;
    int parent;
    pair(int p1,int p2){
        this.pos = p1;
        this.parent = p2;
    }
}
public class cyclicDetection_in_UndirectedGraph {


    public boolean checkcycle(int i, int n, int[][] grid, boolean[] vis) {
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(i, -1));
        vis[i] = true;
        while (!q.isEmpty()) {
            int node = q.peek().pos;
            int parent = q.peek().parent;
            q.remove();
            for (int ele : grid[node]) {
                if (!vis[ele]) {
                    vis[ele] = true;
                    q.add(new pair(ele, node));
                } else if (ele != parent) return true;
            }
        }
        return false;
    }

    public boolean cyclic(int n, int[][] grid) {
        boolean[] vis = new boolean[n];

        for (int i = 0; i < grid.length; i++) {
            if (!vis[i]) {
                if (checkcycle(i, n, grid, vis)) return true;
            }
        }
        return false;
    }
//    using DFS
        public boolean cyclicDFS (int node,int parent, boolean[] vis, int [][]grid){

            vis[node]= true;
            for (int i :grid[node]) {
                if (!vis[i]) {
                    if (cyclicDFS(i, node, vis, grid)) {
                        return true;
                    }
                }
                    else if (i!= parent)return true;
            }


        return  false;
    }
}
