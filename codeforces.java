import java.awt.print.Printable;
import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        dangerous(st);
    }
    static void dangerous(String st){
        char[] chars  = st.toCharArray();
        int cnt = 1;
        for (int i = 1; i <chars.length ; i++) {
            if (chars[i]==chars[i-1]) {
                cnt++;
            }else{
                cnt = 1;
            }
            if (cnt>=7) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
