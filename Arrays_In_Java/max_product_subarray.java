package Arrays_In_Java;

public class max_product_subarray {
//    find the max product of a subarray
    static int maxProduct(int[]arr){
        int n = arr.length;
        int suffix = 1;
        int prefix=1;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (prefix==0)prefix=1;
            if (suffix==0)suffix=1;
            prefix=prefix*arr[i];
            suffix=suffix*(arr[n-i-1]);
            maxi=Math.max(maxi,Math.max(prefix,suffix));

        }
        return maxi;
    }
}
