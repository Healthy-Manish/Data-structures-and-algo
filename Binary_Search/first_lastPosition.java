package Binary_Search;

public class first_lastPosition {

    static int lowerBound(int[]arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=target){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    static int upperBound(int[]arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                high = mid-1;
                ans = mid;
            }
            else low = mid+1;
        }
        return ans -1;
    }

    static int binary_firstSearch(int[]arr,int target){
        int first = -1;
        int low =0;
        int high  = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==target){
                first = mid;
                high=mid-1;
            } else if (arr[mid]>target) {
                high=mid-1;
            }
            else low=mid+1;
        }
        return first;
    }
    static int binary_lastSearch(int[]arr,int target){
        int last = -1;
        int low =0;
        int high  = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==target){
                last = mid;
                low = mid+1;
            } else if (arr[mid]>target) {
                high=mid-1;
            }
            else low=mid+1;
        }
        return last;
    }
    public static int[] searchRange(int[] nums, int target) {
        int first =  binary_firstSearch(nums,target);
        if (first==-1)return new int[]{-1,-1};
        return new int[]{first,binary_lastSearch(nums,target)};

    }
}
