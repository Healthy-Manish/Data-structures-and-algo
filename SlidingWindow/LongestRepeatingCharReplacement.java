package SlidingWindow;

public class LongestRepeatingCharReplacement {

    /*
    PROBLEM LINK : https://leetcode.com/problems/longest-repeating-character-replacement/description/

        You are given a string s and an integer k. You can choose any character
        of the string and change it to any other uppercase English character.
        You can perform this operation at most k times.

        Return the length of the longest substring containing the same letter
        you can get after performing the above operations.



        Example 1:

        Input: s = "ABAB", k = 2
        Output: 4
        Explanation: Replace the two 'A's with two 'B's or vice versa.
     */

    public int characterReplacement(String s, int k) {
        int l =0,r=0,maxlen =0,maxfreq =0;
        int[]hash = new int[26];
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxfreq = Math.max(maxfreq,hash[s.charAt(r)-'A']);

            if((r-l+1)-maxfreq>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            if((r-l+1)-maxfreq<=k){
                maxlen = Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        LongestRepeatingCharReplacement LR = new LongestRepeatingCharReplacement();
        int len = LR.characterReplacement("ABAB",2);
        System.out.println(len);
    }
}
