
public class binaryQuestion3 {
    public static void main(String[] args) {
        //fidning an  element in the infinite range of array
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170,200,510,916};
        int target =5;
        System.out.println(ans(arr,target));
    }
    static int ans(int []arr, int target){
        int start = 0;
        int end = 1;
        while(arr[end]<target){
            int newStart = end+1;
            end= end+(end-start+1)*2;
            start = newStart;
        }
        return binary_search(arr, target, start, end);
    }
    
    static int binary_search(int[] arr, int target,int start,int end){
        while(start<=end){
            int mid = start+(end-start)/2;
                if(arr[mid]>target){
               end  = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
