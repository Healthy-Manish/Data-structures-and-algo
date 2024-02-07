package Binary_Search;

public class lower_upper_bound {
//    find the lower bound of the target
    static int lowerBound(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low<=high){
            int mid = (low+high)/2;


             if (arr[mid]>=target){
                high=mid-1;
                ans = mid;
            }
            else low=mid+1;
        }
        return ans;
    }
    static int upperBound(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low<=high){
            int mid = (low+high)/2;


            if (arr[mid]>target){
                high=mid-1;
                ans = mid;
            }
            else low=mid+1;
        }
        return ans-1;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,3,5,8,8,10,10,11};
        System.out.println(lowerBound(arr,10));

        System.out.println(upperBound(arr,10));
    }
}
