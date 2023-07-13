import java.util.Scanner;

public class char_hashing {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int q=  sc.nextInt();
        int[] hash = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)-'a']+=1;
        }
        while (q!=0) {
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch-'a']);
            q--;
        }
    }
    }

