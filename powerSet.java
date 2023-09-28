import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class powerSet {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(AllPossibleStrings(str));
    }
    static ArrayList<String> AllPossibleStrings(String s){
        int n = s.length();
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <(1<<n) ; i++) {
            String sub = "";
            for (int j = 0; j < n; j++) {
                if ((i &(1<<j))!=0){
                    sub+=s.charAt(j);
                }
            }
            if (sub.length()>0){
                ans.add(sub);
            }
        }
        Collections.sort(ans);
        return ans;
    }

}
