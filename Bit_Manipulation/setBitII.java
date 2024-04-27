package Bit_Manipulation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class setBitII {

    static int findNum(int[]arr){
        int ans = 0;
        for (int i =0;i<32;i++){
            int cnt =0;
            for (int j = 0; j <arr.length ; j++) {
                if ((arr[j]&(1<<i))!=0)cnt++;
            }
            if (cnt%3 ==1){
                ans =(ans|(1<<i));
            }
        }
        return ans;
    }

    static int optimize(int[]arr){//tc :N(logN)
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i+=3) {
            if (arr[i]!=arr[i-1])return arr[i-1];
        }
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[]arr = {3,2,3,3,5,5,5,2,2,122};
        int ans =optimize(arr);
        System.out.println(ans);
    }
}
