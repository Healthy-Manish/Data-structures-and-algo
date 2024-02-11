package Binary_Search;

public class singleElement_inSortedArray {
    /*
    find the unique element in the sorted array containing every element duplicate
    except 1

    index-> 0 1 2 3 4 5 6 7 8 9 10
    array->[1,1,2,2,3,3,4,5,5,6,6]

    here we can see before unique element that is in left half first occurrence of
    a number is in even position then in odd
    but after the unique element first position of a number is in odd
    position then in even

    hence we can use this logic
     */
    static int search(int[]arr){
        int n = arr.length;
        if (arr.length==1)return arr[0];
        if (arr[0]!=arr[1])return arr[0];
        if (arr[n-1]!=arr[n-2])return arr[n-1];
        int low = 1;
        int high = n-2;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])return arr[mid];

            if((mid%2==1 && arr[mid]==arr[mid-1])||(mid%2==0 &&arr[mid]==arr[mid+1])){
                low = mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
}
