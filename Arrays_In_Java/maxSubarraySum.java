package Arrays_In_Java;

public class maxSubarraySum {

    static  void maxSum(int[] arr){
        int n= arr.length;
        int maxi =Integer.MIN_VALUE;
        int sum = 0;
        int start=0,arrStart=-1,arrEnd= -1;
        for (int i = 0; i <n ; i++) {
            if (sum==0)start = i;
            sum+=arr[i];

            if (sum>maxi){
                maxi= sum;
                arrStart = start;
                arrEnd = i;
            }
            if (sum<0){
                sum = 0;
            }
        }
        for (int i = arrStart; i <=arrEnd ; i++) {
            System.out.print(arr[i]+" ");
        }
//        if (maxi<0)maxi = 0;
//        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

//        long maxSum = maxSum(arr);
//        System.out.println("The maximum subarray sum is: " + maxSum);
        maxSum(arr);
    }
}
