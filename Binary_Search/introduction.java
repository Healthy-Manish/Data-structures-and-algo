package Binary_Search;

public class introduction {
    static int search(int[] arr,int target){
        int high = arr.length-1;
        int low = 0;
        while (high>=low){
            int mid =(low+high)/2;
            if (arr[mid]==target)return mid;
            else if(arr[mid]>target)high=mid-1;
            else low = mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {3,4,6,7,9,12,16,17};
        int target = 51;
        System.out.println(search(arr,target));
    }
}
