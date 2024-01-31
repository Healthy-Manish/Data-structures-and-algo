package Arrays_In_Java;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
//    Q1. Given row and column number find the element at that positon in pascal triangle
//          the simple formula for this is  r-1
//                                              C
//                                                c-1
//    or (r-1)!/(n)!(n-r)!
    static int nCr(int n,int r){
        int res = 1;
        for (int i = 0; i <r ; i++) {
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }
    static int findpos(int r, int c){
        return nCr(r-1,c-1);
    }

//    Q2. print the given row r of the pascal triangle
    static ArrayList<Integer> pascalRow(int n){
        ArrayList<Integer>arr = new ArrayList<>();
        int ans = 1;

        arr.add(ans);

        for (int i = 1; i <n ; i++) {
            ans = ans*(n-i);
            ans = ans/i;
//            System.out.print(ans+" ");
            arr.add(ans);
        }
return arr;
    }

//    Q3. print the whole pascal triangle upto row r
    static List<List<Integer>> Pascal(int n){
        List<List<Integer>>ans = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
           ans.add(pascalRow(i));
        }
        return ans;
    }
    public static void main(String[] args) {
//        System.out.println(findpos(3,2));
//            pascalRow(6);
        List<List<Integer>>pascal = Pascal(6);
        System.out.println(pascal);
    }

}
