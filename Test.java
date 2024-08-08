import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static int maximumEnergy(int[] energy, int k) {
        int maxi=Integer.MIN_VALUE;

        for (int i = energy.length-1; i >=energy.length-k ; i--) {
            int sum =0;
            for (int j = i; j >=0 ; j-=k) {
                sum+=energy[j];
                maxi=Math.max(maxi,sum);
            }
        }
        return maxi;
    }
    public int convertBinary(String s){
        int num = 0;
        int n = s.length()-1;
        int p = 0;
        while(n>=0){
            int c = Character.getNumericValue(s.charAt(n));
            num +=c*Math.pow(2,p++);
            n--;
        }
        return num;
    }
    public int numSteps(String s) {
      int cnt = 0;
      StringBuilder st= new StringBuilder(s);
      int n = st.length()-1;
      while (!st.toString().equals("1")){
          if (st.charAt(n)=='1'){
              st.setCharAt(n-1,'1');
              st.deleteCharAt(n);
              cnt+=2;
          }
          else {
              cnt++;
              st.deleteCharAt(n);

          }
          n--;
      }
      return cnt;
    }
    public static void main(String[] args) {
        System.out.println(Math.sqrt(6));
    }
}
