package GreedyAlgo;

public class JumpGame {
//    PROBLEM LINK : https://leetcode.com/problems/jump-game/

    public boolean canJump(int[] nums) {
        int maxInd = 0;
        for(int i =0;i<nums.length;i++){
            if(i>maxInd)return false;

            maxInd = Math.max(maxInd,i+nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums ={2,3,1,1,4};
        JumpGame jg = new JumpGame();
        System.out.println(jg.canJump(nums));
    }
}
