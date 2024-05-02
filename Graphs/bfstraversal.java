package Graphs;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class bfstraversal {

//    PROBLEM LINK: https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>bfs = new ArrayList<>();
        boolean[]visited = new boolean[V];
        Queue<Integer>q = new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            for(int it: adj.get(node)){
                if(visited[it]==false){
                    visited[it]=true;

                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
