package Arrays_In_Java;

import java.util.Arrays;

public class repeating_missingNum {
    static void cyclic(int[]arr){
        int cnt = 0;
        while(cnt<arr.length){
            int correct = arr[cnt]-1;
            if (arr[cnt]!=arr[correct]){
                int temp = arr[cnt];
                arr[cnt]=arr[correct];
                arr[correct]=temp;
            }
            else cnt++;
        }
    }

    public static void main(String[] args) {
        int[]arr = {4,3,6,2,1,1};
        cyclic(arr);
        for (int i = 0; i <arr.length ; i++) {
            int correct = i+1;
            if (arr[i]!=correct){
                int miss = i+1;
                System.out.println("missing number is "+miss);
                System.out.println("repeating number is "+arr[i]);
                break;
            }
        }


    }
}

