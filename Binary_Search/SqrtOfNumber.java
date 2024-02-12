package Binary_Search;

public class SqrtOfNumber {
    static int search(int n){
        int low = 1;
        int high = n;
        int ans = 1;
        while (low<=high){
            int mid = (low+high)/2;
            if (mid*mid==n)return mid;
            if (mid*mid>n)high=mid-1;
            else {
                ans = mid;
                low=mid+1;
            }
        }
         return ans;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(search(n));
    }
}
