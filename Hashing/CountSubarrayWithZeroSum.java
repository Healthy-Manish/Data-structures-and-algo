package Hashing;

import java.util.HashMap;

public class CountSubarrayWithZeroSum {
    public static  int solve(int[]A,int B){
        HashMap<Integer,Integer> freq = new HashMap<>();
        int cnt = 0;
        int xorr = 0;
        int n = A.length;
        for (int i = 0; i <n ; i++) {
           xorr = xorr^A[i];
           if (freq.get(xorr^B)!=null){
               cnt+=freq.get(xorr^B);
           }
           if (xorr==B)cnt++;
           if (freq.get(xorr)!=n){
               freq.put(xorr,freq.get(xorr)+1);
           }
           else {
               freq.put(xorr,1);
           }
        }
        return cnt;
    }
}
