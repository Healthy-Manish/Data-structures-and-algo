package Arrays_In_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
    /*
    Given array contain N/2 positive and N/2 negative
    arrange them in order
    ex -> arr[] = {3,1,-2,-5,2,-4}
    rearrange them in order + - + - +....
    arr[] = {3,-2,1,-5,2,-4}
     */
    static int[] rearrange(int[] arr){
        ArrayList<Integer>pos  = new ArrayList<>();
        ArrayList<Integer>neg  = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                neg.add(arr[i]);
            }
            else {
                pos.add(arr[i]);
            }
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length/2; i++) {
            ans[2*i] = pos.get(i);
            ans[2*i+1] = neg.get(i);
        }
        return ans;
    }

//    ---------> OPTIMAL APPROACH <------------
    static int[] rearrangeArray(int[] arr){
        int posInd = 0;
        int negInd = 1;
        int[] result = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<0){
                result[negInd]= arr[i];
                negInd+=2;
            }
            else {
                result[posInd]= arr[i];
                posInd+=2;
            }
        }
        return result;
    }

//    arrange array if positive are not equal to negatives then put leftout elements in the last of the array
    static int[] rearrangeV2(int[] arr){
        ArrayList<Integer>pos = new ArrayList<>();
        ArrayList<Integer>neg = new ArrayList<>();

        int[] res = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<0){
                neg.add(arr[i]);
            }
            else {
                pos.add(arr[i]);
            }
        }
        int ind = 0;
      if (pos.size()>neg.size()){
          for (int i = 0; i <neg.size() ; i++) {
             res[2*i] = pos.get(i);
             res[2*i+1]= neg.get(i);
          }
          ind = neg.size()*2;
          for (int i = neg.size(); i < pos.size(); i++) {
              res[ind]= pos.get(i);
              ind++;
          }
      }
      else {
          for (int i = 0; i <pos.size() ; i++) {
              res[2*i] = pos.get(i);
              res[2*i+1]= neg.get(i);
          }
          ind = pos.size()*2;
          for (int i = pos.size(); i < neg.size(); i++) {
              res[ind]= neg.get(i);
              ind++;
          }

      }
        return res;
    }
    public static void main(String[] args) {
        int[]arr = {3,1,-2,-5,2,-4,-6,8,-9};
        int[] ans = rearrangeV2(arr);
        System.out.println(Arrays.toString(ans));
    }
}
