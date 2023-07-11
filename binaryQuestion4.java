public class binaryQuestion4 {

    public static void main(String[] args) {
        int[]arr = {0,1,2,5,3,0};
        System.out.println(ans(arr));
        int target = 3;
        int max = ans(arr);
        if(binary_search(arr,target,0,max)!=-1){
            System.out.println(binary_search(arr,target,0,max));

        }
        else {
          System.out.println(binary_search(arr,target,max,arr.length-1));

        }
    }
    static int ans(int[]arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
           else{
                end = mid ;
            }
          
        }
        return start;
    }
    //finding target element in mountain array
    static int binary_search(int[] arr, int target,int start,int end){
        if(arr[start]<arr[end]){
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
    }
    else{
         while(arr[start]>=arr[end]){
            int mid = start+(end-start)/2;
                if(arr[mid]<target){
               end  = mid-1;
            }
            else if(arr[mid]>target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
    }
        return -1;
    }
}
