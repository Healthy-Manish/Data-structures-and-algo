package Arrays_In_Java;

public class buyAndSellStocks {
    /*
    return the best profit we get from buying and selling a stock
    int[] arr = {7,1,5,3,6,4}
    the best day to buy is 1 and selling is 6 so that we can make a profit of 5
     */
    static int maxProfit(int[] arr){
        int min = arr[0];
        int profit  =0;
        for (int i = 0; i < arr.length; i++) {
            int  cost = arr[i]-min;
            profit = Integer.max(profit,cost);
            min = Integer.min(arr[i],min);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr= {7,1,5,3,6,4,9};
        int ans= maxProfit(arr);
        System.out.println(ans);
    }
}
