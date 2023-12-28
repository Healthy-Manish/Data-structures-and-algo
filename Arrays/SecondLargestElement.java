package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestElement {
//find second largest and second smallest element in the array
    static int secondLargest(List<Integer>a){
        int sLarge = -1;
        int  Large = a.get(0);
        int n= a.size();
        for (int i = 1; i <n ; i++) {
            if (a.get(i)>Large){
                sLarge = Large;
                Large = a.get(i);
            }
            else {
                if (a.get(i)>sLarge){
                    sLarge = a.get(i);
                }
            }
        }
        return sLarge;
    }
    static int secondSmallest(List<Integer>a){
        int sSmall= Integer.MAX_VALUE;
        int small = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i)<small){
                sSmall = small;
                small = a.get(i);
            }
            else {
                if (a.get(i)>small && a.get(i)<sSmall){
                    sSmall = a.get(i);
                }
            }
        }
        return sSmall;

    }

    static List<Integer> getSecondOrder(List<Integer> a){
        int slargest  = secondLargest(a);
        int sSmallest = secondSmallest(a);

        List<Integer>lst = new ArrayList<>();
        lst.add(slargest);
        lst.add(sSmallest);
        return lst;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(getSecondOrder(l));
    }
}
