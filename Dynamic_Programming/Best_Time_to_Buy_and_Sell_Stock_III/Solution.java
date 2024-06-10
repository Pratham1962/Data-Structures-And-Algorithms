class Solution {

    public static int profit(int[] prices, int ind, int buy, int n, int[][][] dp,int cnt) {
        if (ind == n || cnt<=0)
            return 0;

        if (dp[ind][buy][cnt] != -1)
            return dp[ind][buy][cnt];

        int profit = 0;

        if (buy == 0) {
            profit = Math.max(0 + profit(prices, ind + 1, 0, n, dp,cnt),
                    -prices[ind] + profit(prices, ind + 1, 1, n, dp,cnt));
        }

        if (buy == 1) {
            profit = Math.max(0 + profit(prices, ind + 1, 1, n, dp,cnt),
                    prices[ind] + profit(prices, ind + 1, 0, n, dp,cnt-1));
        }

        dp[ind][buy][cnt] = profit;
        return profit;
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[][][] dp = new int[n][2][3];
        for (int[][] arr : dp){
            for(int[] it:arr) Arrays.fill(it,-1);
        }

       
        int buy = 0;

        return profit(prices, 0, buy, n, dp, 2);
    }
}
