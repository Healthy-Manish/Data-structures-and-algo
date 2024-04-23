package Bit_Manipulation;

public class MinBitFliips {
//   PROBLEM LINK : https://leetcode.com/problems/minimum-bit-flips-to-convert-number/submissions/1239857420/

    static int flip(int start,int goal){
        int ans = start^goal;
        int cnt =0;
        while(ans>0){
            if((ans &1)!=0)cnt++;
            ans= ans>>1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int start = 7;
        int goal = 10;
        int ans = flip(start,goal);
        System.out.println(ans);
    }
}
