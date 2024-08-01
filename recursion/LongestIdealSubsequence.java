package recursion;
import java.util.ArrayList;
public class LongestIdealSubsequence {
    static void subsets(String str, String up,int k,ArrayList<String>ans){

        if(up.isEmpty()){
            ans.add(str);
            return;
        }

        char c = up.charAt(0);
        if(str.isEmpty()||Math.abs(c-str.charAt(str.length()-1))<=k){
            subsets(str+c,up.substring(1),k,ans);
        }

        subsets(str,up.substring(1),k,ans);

    }

    static public int longestIdealString(String s, int k) {
        ArrayList<String> ans = new ArrayList<>();
        subsets("",s,2,ans);
        int len = Integer.MIN_VALUE;
        for(String temp: ans){
            len = Math.max(len,temp.length());
        }
        return  len;
    }

    public static void main(String[] args) {

        String s ="abcd";
        int ans = longestIdealString(s,2);
        System.out.println(ans);
    }
}
