package Hashing;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public static int longestSubstring(String arr){
        int l = 0;
        int r = 0;
        int len = 0;

        HashMap<Character,Integer>hashSet = new HashMap<>();
        if (arr.isEmpty())return 0;
        while (r<arr.length()){
            if (hashSet.containsKey(arr.charAt(r))){
                l = Math.max(hashSet.get(arr.charAt(r))+1,l);
            }
            hashSet.put(arr.charAt(r),r);
            len=Math.max(len,r-l+1);
            r++;
        }
        return len;
    }

    public static void main(String[] args) {
        String arr = "pwwkew";
        System.out.println(longestSubstring(arr));
    }
}
