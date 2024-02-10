package Binary_Search;

public class find_Nth_Root {
//    find nth root of a number
    static int findRoot(int nth,int number){
        int low =1;
        int high = number;

        while (low<=high){
            int mid=(low+high)/2;
            if (Math.pow(mid,nth)==number)return mid;
            if (Math.pow(mid,nth)>number)high=mid-1;
            else {

                low = high+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nth = 4;
        int number= 81;
        System.out.println(findRoot(nth,number));
    }
}
