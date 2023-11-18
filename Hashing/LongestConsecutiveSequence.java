package Hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static  int longestConsecutive(int[]nums){
        Set<Integer> hashset = new HashSet<>();
        for(int num :nums){
            hashset.add(num);
        }
        int longestStreak = 0;
        for(int num:nums){
            if (!hashset.contains(num- 1)) {

                int currentNum = num;
                int currentStreak = 1;
                while (hashset.contains(currentNum+1)){
                    currentNum+=1;
                    currentStreak+=1;
                }
                longestStreak= Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }


}
