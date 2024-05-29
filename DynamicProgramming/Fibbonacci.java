package DynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibbonacci {

    static int f(int n, ArrayList<Integer> dp){
        if (n<=1)return n;
        if(dp.get(n)!=-1)return dp.get(n);
        dp.set(n,f(n-1,dp)+f(n-2,dp));
        return dp.get(n);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Integer>dp =new ArrayList<>();
        for (int i = 0; i <=n ; i++) {
            dp.add(-1);
        }
        System.out.println(f(n,dp));
    }
}
