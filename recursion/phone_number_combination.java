package recursion;

import java.util.ArrayList;

public class phone_number_combination {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        pad("","125",ans);
        System.out.println(ans);
    }
    static void pad(String p , String up, ArrayList<String>ans){
        if (up.isEmpty()){
            ans.add(p);
            return;
        }

       int digit =  up.charAt(0)-'0';
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)('a'+i);

            pad(p+ch,up.substring(1),ans);
        }
    }

}
