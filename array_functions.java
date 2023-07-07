import java.util.Arrays;

public class array_functions {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        change(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    //arrays are mutable in java
    static void change(int[] arr){
        arr[0] = 99;
    }
}
