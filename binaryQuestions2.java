import java.util.*;

public class binaryQuestions2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,6,7,7,7,7,8,8,9};
        int target = 8;
        System.out.println(Arrays.toString(search(nums,target)));
    }
    static int[] search(int[] nums, int target){
        int[] ans ={-1,-1};
        int start = find_the_first(nums,target,true);
        int end = find_the_first(nums,target,false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int find_the_first(int[] arr, int target, boolean is_true){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(end>=start){
            int mid = (start+end)/2;
            if(arr[mid]>target){
                end = mid-1;
        
            }
            else if(arr[mid]<target){
                    start = mid+1;

            }
            else{
                ans = mid;
                if(is_true){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
