package DynamicProgramming;

public class BUY_SELL2 {

//    PROBLEM LINK: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

    public int maxProfit(int[] prices) {
        int ahead[] = new int[2];
        int curr[] = new int[2];
        int n = prices.length;
        for(int i = n-1;i>=0;i--){
            for(int j =0;j<=1;j++){
                int profit = Integer.MIN_VALUE;
                if(j==1){
                    profit=Math.max(-prices[i]+ahead[0],ahead[1]);
                }
                else profit = Math.max(prices[i]+ahead[1],ahead[0]);
                curr[j]= profit;
            }
            ahead = curr;
        }
        return ahead[1];

    }
}
