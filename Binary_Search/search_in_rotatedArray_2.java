package Binary_Search;

public class search_in_rotatedArray_2 {
//    perform search in the rotated array and the
//    array may have duplicate
    static boolean search(int[]arr,int target){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid =(low+high)/2;
            if (arr[mid]==target)return true;
            if (arr[low]==arr[mid]&& arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            if (arr[low]<=arr[mid]){
                if (arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }
                else low =mid+1;
            }
            else {
                if (arr[mid]<=target && target<=arr[high]){
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[]arr = {3,1,2,3,3,3,3};
        int target = 1;
        System.out.println(search(arr,target));
    }
}
