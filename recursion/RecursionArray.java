package recursion;

public class RecursionArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6};
        System.out.println(sorted(arr, 0));
        System.out.println(linear(arr, 6,0));
    }
    //checking whether array is sorted or not
    static boolean sorted(int[]arr, int index){
        if (index == arr.length - 1){
            return true;
        }
        return arr[index]<arr[index+1]&& sorted(arr, index+1);
    }

    //linear search with recursion
    static boolean linear(int[]arr,int target, int index){
        if (index==arr.length){
            return false;
        }
        if (arr[index]==target)return true;
        return linear(arr, target, index+1);
    }


}
