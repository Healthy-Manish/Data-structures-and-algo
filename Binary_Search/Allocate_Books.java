package Binary_Search;
import java.util.*;
public class Allocate_Books {

//    problem link- https://www.codingninjas.com/studio/problems/allocate-books_1090540?leftPanelTabValue=SUBMISSION
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        int sum = 0;
        int maxi =Collections.max(arr);;
        if(m>n)return -1;


        for(int i =0;i<n;i++){
            sum+=arr.get(i);
        }
        int low = maxi;
        int high = sum;
        int ans = 0;
        while(low<=high){
            int mid= low+(high-low)/2;
            int stu = total(arr, mid,n);

            if(stu<=m)high = mid-1;
            else low = mid+1;

        }
        return low;
    }
    static int total(ArrayList<Integer> arr,int pages,int n){
        int st =1;
        long totalPage =0;
        for(int i= 0;i<n;i++){
            if(totalPage+arr.get(i)<=pages){
                totalPage+=arr.get(i);
            }
            else{
                st+=1;
                totalPage=arr.get(i);
            }

        }
        return st;
    }
}
