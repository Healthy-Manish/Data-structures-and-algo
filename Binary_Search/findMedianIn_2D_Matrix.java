package Binary_Search;

public class findMedianIn_2D_Matrix {

        static int upperBound(int[]arr,int k){
            int low= 0;
            int high = arr.length-1;
            int ans = arr.length;
            while(low<=high){
                int mid=(low+high)/2;
                if (arr[mid]>k){
                    high=mid-1;
                    ans = mid;
                }
                else low=mid+1;
            }
            return ans;
        }

        static int smaller(int[][]arr,int k){
            int cnt = 0;
            for(int i =0;i<arr.length;i++){
                cnt+=upperBound(arr[i], k);
            }
            return cnt;
        }
        public static int findMedian(int[][] matrix, int m, int n) {
            // Write your code here

            int low = Integer.MAX_VALUE;
            int high = Integer.MIN_VALUE;

            int median_ind = (m*n)/2;

            for(int i = 0;i<n;i++){
                if(matrix[i][0]<low)low = matrix[i][0];
                if(matrix[i][m-1]>high)high = matrix[i][m-1];

            }
            while(low<=high){
                int mid = (low+high)/2;
                int smallerThan = smaller(matrix, mid);
                if(smallerThan<=median_ind){
                    low = mid+1;
                }
                else high =mid-1;
            }
            return low;
        }

    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int[][]arr = {
                {1,2,3,4,5},
                {8,9,11,12,13},
                {21,23,25,27,29}
        };
        System.out.println(findMedian(arr,m,n));
    }
    }

