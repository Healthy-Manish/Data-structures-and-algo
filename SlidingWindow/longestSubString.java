package SlidingWindow;

import java.util.HashMap;

public class longestSubString {
//    find longest substring in string without repeating characters
    static int LongSubString(String str){
        if (str.isEmpty())return 0;
        HashMap<Character,Integer>map = new HashMap<>();
        int l =0,r =0,maxlen=0;
        while (r<str.length()){
            if (map.containsKey(str.charAt(r))){
                l = Math.max(map.get(str.charAt(r))+1,l);

            }
            map.put(str.charAt(r),r);
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        int len = LongSubString(str);
        System.out.println(len);
    }
}
