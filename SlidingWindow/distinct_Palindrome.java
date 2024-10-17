package SlidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class distinct_Palindrome {

    static int countSubstrings(String s) {
        int n = s.length();
        int count = 0;


        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = (center+1)/2;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abaaa"));
    }
}
