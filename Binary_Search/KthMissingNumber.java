package Binary_Search;

public class KthMissingNumber {
/*
    in array ->[2,3,4,7,11] the 5th missing number will be 9

    the pattern we can see
    index-> 0  1  2  3  4
    array->[2, 3, 4, 7, 11]

    the number  missing till 7 are 7-4 = 3
    the number missing till 11 are 11-5 =6
    here we know 5th missing number is in range btw 7 to 11
    now we have to find it

 */

    static int findMiss(int[]arr,int k){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            int miss  = arr[mid]-(mid+1);
            if (miss<k){
                low=mid+1;
            }
            else high=mid-1;
        }

        return high+k+1;

    }
}
