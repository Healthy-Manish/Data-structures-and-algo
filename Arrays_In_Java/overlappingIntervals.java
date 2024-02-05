package Arrays_In_Java;

import java.util.*;

public class overlappingIntervals {

    static List<List<Integer>> overlapping (List<List<Integer>>arr){

        List<List<Integer>>ans = new ArrayList<>();


        for (int i = 0; i <arr.size() ; i++) {
            int start = arr.get(i).get(0);
            int end = arr.get(i).get(1);
            if (!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            for (int j = i+1; j <arr.size() ; j++) {
                if (arr.get(j).get(0)<=end){
                    end = Math.max(end,arr.get(j).get(1));
                }else {
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }
        return  ans;
    }

    static List<List<Integer>>optimal(List<List<Integer>>arr){
        List<List<Integer>>ans = new ArrayList<>();
        for (int i = 0; i <arr.size() ; i++) {
            if (ans.isEmpty()||arr.get(i).get(0)>arr.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(arr.get(i).get(0),arr.get(i).get(1)));
            }
            else {
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr.get(i).get(1)));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<List<Integer>> val = new ArrayList<>(Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(8, 10),
                Arrays.asList(2, 6),
                Arrays.asList(15, 18)

        ));
        val.sort(Comparator.comparingInt(row -> row.get(0)));
        int[][] arr = {{1,3},{8,10},{2,6},{15,18}};

        System.out.println(optimal(val));
    }

}
