package Binary_Search;

public class Find_Peak_In_2D_Array {

    static int findMax(int[][]arr,int col){
        int maxi = -1;
        int ind = -1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i][col]>maxi){
                maxi= arr[i][col];
                ind =i;
            }
        }
        return ind;
    }
    static int[] findPeak(int[][]arr,int r,int c){
        int low = 0;
        int high = c-1;
        while (low<=high){
            int mid = (low+high)/2;
            int row = findMax(arr,mid);
            int left = (mid-1>=0)?arr[row][mid-1]:-1;
            int right = (mid+1<c)?arr[row][mid+1]:-1;

            if(arr[row][mid]>left && arr[row][mid]>right){
                return new int[]{row,mid};
            }
            else if(arr[row][mid]<left)high =mid-1;
            else low = mid+1;

        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {

    }
}
