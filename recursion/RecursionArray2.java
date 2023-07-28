package recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionArray2 {

    public static void main(String[] args) {
        int[]arr = {1,2,3,3,3,4,5,6,3,0};
        System.out.println(search(arr,3,0));
        int[]arr2  = {5,6,7,2,3,4};
        System.out.println(rotatedSearch(arr2,3,0,arr2.length-1));
    }
    static ArrayList<Integer> search(int[]arr, int target,int index){
         ArrayList<Integer>list = new ArrayList<>();

        if (arr.length==index)return list;
        if (arr[index]==target)list.add(index);
        ArrayList<Integer>ansfromBelow = search(arr,target,index+1);
        list.addAll(ansfromBelow);
        return list;
    }
    //Rotated binary search
        static int rotatedSearch(int[]arr, int target , int s, int e){
        if (s>e){
            return -1;
        }
        int m  = s+(e-s)/2;
        if (arr[m]==target)return m;
        if (arr[s]<=arr[m]){
            if (target>=arr[s]&&target<=arr[m]){
               return rotatedSearch(arr, target,s,m-1 );
            }else {
                return rotatedSearch(arr, target,m+1, e );
            }
        }
        if(target>=arr[m]&& target<=arr[e]){
            return rotatedSearch(arr,target,m+1,e);
        }

            return rotatedSearch(arr, target,s,m-1 );


        }
}
