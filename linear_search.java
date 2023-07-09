public class linear_search {
    public static void main(String[] args) {
        int [] arr ={2,1,6,8,90,16,45};
        int target = 6;
        System.out.println(linear_Search(arr,target));
        System.out.println(smallest(arr));
    }

    // searching for an element in array
    static int linear_Search(int[]arr,int target){
        if(arr.length == 0)return -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target)return i;
        }
        return -1;
    }

    //finding smallest element in array
    static int smallest(int[]arr){
        if(arr.length==0)return -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min)min = arr[i];
        }

        return min;
    }
}
