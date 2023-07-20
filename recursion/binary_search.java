package recursion;

public class binary_search {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        System.out.println(binary(arr,0,arr.length-1,1));
    }
    static int binary(int[]arr, int start, int end, int target) {
        if (start > end) return -1;


        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return binary(arr, start, mid - 1, target);
        }

        return binary(arr, mid + 1, end, target);
    }
}
