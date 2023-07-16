import java.util.HashMap;
import java.util.Scanner;

public class HashMap_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

            if (map.containsKey(arr[i])){
               map.replace(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        int q = sc.nextInt();
        while (q!=0){
            int num = sc.nextInt();
            System.out.println(map.get(num));

            q--;

        }

    }
}
