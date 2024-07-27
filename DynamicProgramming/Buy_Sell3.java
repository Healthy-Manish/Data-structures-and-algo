package DynamicProgramming;

public class Buy_Sell3 {
//    PROBLEM LINK: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
public int f(int[] prices,int ind,int buy,int cap,int dp[][][]){
    if(ind==prices.length)return 0;
    if(cap<=0)return 0;

    int profit= 0;
    if(dp[ind][buy][cap]!=-1)return dp[ind][buy][cap];
    if(buy==1){
        profit = Math.max(-prices[ind]+f(prices,ind+1,0,cap,dp),f(prices,ind+1,1,cap,dp));

    }
    else{
        profit = Math.max(prices[ind]+f(prices,ind+1,1,cap-1,dp),f(prices,ind+1,0,cap,dp));
    }

    return dp[ind][buy][cap]= profit;
}
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][][]= new int[n+1][2][3];
        for(int i=0;i<=n;i++){
            for(int j = 0;j<2;j++){
                dp[i][j][0]=0;
                if(i==n){
                    dp[i][j][1]=0;
                    dp[i][j][2]=0;
                }
            }
        }
        for(int ind = n-1;ind>=0;ind--){
            for(int buy=0;buy<2;buy++){
                for(int cap= 1;cap<3;cap++){
                    int profit = 0;
                    if(buy==1){
                        profit = Math.max(-prices[ind]+dp[ind+1][0][cap],dp[ind+1][1][cap]);

                    }
                    else{
                        profit = Math.max(prices[ind]+dp[ind+1][1][cap-1],dp[ind+1][0][cap]);
                    }

                    dp[ind][buy][cap]= profit;
                }
            }
        }

        return dp[0][1][2];

    }
}
