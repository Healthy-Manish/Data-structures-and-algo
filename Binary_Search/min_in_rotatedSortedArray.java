package Binary_Search;

public class min_in_rotatedSortedArray {
//    find min element in rotated array
    static int search(int[]arr){
        int low =0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while (low<=high){
            int mid  = (low+high)/2;
            if (arr[low]<=arr[high])return Math.min(ans,arr[low]);
            if (arr[low]<=arr[mid]){
                ans = Math.min(ans,arr[low]);
                low  = mid+1;
            }
            else {
                ans = Math.min(ans,arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={5,6,2,3};
        System.out.println(search(arr));
    }
}
