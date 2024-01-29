package Arrays_In_Java;

import java.util.ArrayList;
import java.util.List;

public class intersection_sortedArray {

    static List<Integer> intersection(int[] a, int[] b){
        int i = 0;
        int j = 0;
        List<Integer> lst = new ArrayList<>();
        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
                i++;
            }
            else if (a[i]>b[j]) {
                j++;
            }
           else{
                lst.add(a[i]);
                i++;
                j++;
            }

        }
        return lst;

    }

    public static void main(String[] args) {
        int[] a = {1,1,2,3,3,4,5,6};
        int[]b = {2,3,3,4,5,6,7};
        System.out.println(intersection(a,b));
    }
}
