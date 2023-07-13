import java.util.Scanner;

public class hashmaps {
    public static void main(String[] args) {

        //count elements of array
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[]hash = new int[12];
        for (int i = 0; i < size; i++) {
            hash[arr[i]]+=1;
        }
        int q = sc.nextInt();
        while (q!=0){
            int num  = sc.nextInt();
            System.out.println(hash[num]);
            q--;
        }

    }
}
