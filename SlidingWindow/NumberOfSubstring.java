package SlidingWindow;

public class NumberOfSubstring {

    /*
    PROBLEM LINK - https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/

    Given a string s consisting only of characters a, b and c.

    Return the number of substrings containing at least one occurrence of all these characters a, b and c.



    Example 1:

    Input: s = "abcabc"
    Output: 10
    Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc",
     "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).

     */
    static int numberOfSubstrings(String s) {
        int[] lastSeen = {-1,-1,-1};
        int cnt = 0;
        for(int i =0;i<s.length();i++){
            lastSeen[s.charAt(i)-'a']=i;
            if(lastSeen[0]!=-1&& lastSeen[1]!=-1&& lastSeen[2]!=-1){
                cnt+=(1+Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2])));
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "aaacb";
        int cnt = numberOfSubstrings(s);
        System.out.println(cnt);
    }
}
