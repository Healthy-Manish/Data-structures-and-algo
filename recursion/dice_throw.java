package recursion;

import java.util.ArrayList;

public class dice_throw {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 4;
       countSum(new ArrayList<>(),target);
    }
    static void countSum(ArrayList<Integer> ans,int target){

            if(target==0) {
                System.out.println(ans);

                return;
            }
        for (int i = 1; i <=6 && i<=target; i++) {
            ans.add(i);
                countSum(ans,target-i);
                ans.remove(ans.size()-1);

        }

    }
}
