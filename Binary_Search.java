public class Binary_Search {
    public static void main(String[] args) {
        //binary serach is also a searching algo. which take
        //time complexity of O(logn)
        //it is applied on a sorted array
        int[] arr = {1,3,5,7,8,9,12,34,56,78,90};
        int target = 9;
        System.out.println(binary(arr,target));
        }
    

    static int binary(int[] arr, int target){
          int start = 0;
        int end = arr.length -1;
        if(arr.length==0)return-1;
        while(end>start){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target>arr[mid])start = mid+1;
            else end = mid-1;
    }
    return -1;
}
}
