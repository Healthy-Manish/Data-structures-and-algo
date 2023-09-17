package MATHS_DSA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Maths_in_DSA2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int minlen = 0;
            int n= sc.nextInt();
            int[] arr = new int[n];
            for(int i =0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int[] arr2 = new int[n];
            for(int i = 0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
         int left = 0;
         int right  = n-1;
         while(left<n && arr[left]==arr2[left]){
             left++;
         }
         while(right>=0 && arr[right]==arr2[right]){
             right--;
         }
            System.out.println(right-left+1);
            test-=1;
        }
    }
}
