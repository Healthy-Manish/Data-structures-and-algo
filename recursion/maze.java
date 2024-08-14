package recursion;

import java.util.ArrayList;

public class maze {
    static int puzzle(int r, int c){
      if (r==1|| c==1)return 1;
      int left = puzzle(r-1,c);

      int right  = puzzle(r,c-1);
      return left+right;

    }
    static void path(String p,int r,int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }
        static void pathDiagnal(String p,int r,int c) {
            if (r == 1 && c == 1) {
                System.out.println(p);
                return;
            }
            if (r>1&&c>1){
                pathDiagnal(p+'C',r-1,c-1);
            }
            if (r > 1) {
                pathDiagnal(p + 'D', r - 1, c);
            }
            if (c > 1) {
                pathDiagnal(p + 'R', r, c - 1);
            }
        }
    static void pathObstacle(String p,int[][]maze,int r,int c) {
        if (r ==maze.length-1  && c == maze[0].length-1) {
            System.out.println(p);

        }
        if (maze[r][c]==0)return ;
        if (r<maze.length-1){
            pathObstacle(p+'d',maze,r+1,c);
        }


        if (c <maze[0].length-1) {
            pathObstacle(p + 'r',maze, r, c +1);
        }
    }
    static void allPaths(String p,int[][]maze,int r,int c,boolean[][]check,int cnt) {
        if (r ==maze.length-1  && c == maze[0].length-1) {
            System.out.println(p);
            cnt+=1;
            return;
        }
        if (check[r][c])return;
        check[r][c]=true;
        if (r<maze.length-1){

            allPaths(p+'d',maze,r+1,c,check,cnt);
        }


        if (c <maze[0].length-1) {

            allPaths(p + 'r',maze, r, c +1,check,cnt);
        }
        if(r>0){
            allPaths(p+'u',maze,r-1,c,check,cnt);
        }
        if(c>0){
            allPaths(p+'l',maze,r,c-1,check,cnt);
        }
        check[r][c]=false;
    }
    public static void main(String[] args) {
//        pathDiagnal("",3,3);
        int[][]maze ={{0,1,0},{1,1,1},{1,1,0}};
        boolean[][]check=new boolean[3][3];
        pathObstacle("",maze,1,0);
    }
}
