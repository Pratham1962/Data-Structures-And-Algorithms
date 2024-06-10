class Solution {

    public static int profit(int[] prices, int ind, int buy, int n, int[][] dp) {
        if (ind >= n)
            return 0;

        if (dp[ind][buy] != -1)
            return dp[ind][buy];

        int profit = 0;

        if (buy == 0) {
            profit = Math.max(0 + profit(prices, ind + 1, 0, n, dp),
                    -prices[ind] + profit(prices, ind + 1, 1, n, dp));
        }

        if (buy == 1) {
            profit = Math.max(0 + profit(prices, ind + 1, 1, n, dp),
                    prices[ind] + profit(prices, ind + 2, 0, n, dp));
        }

        dp[ind][buy] = profit;
        return profit;
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[][] dp = new int[n][2];
        for (int[] arr : dp)
            Arrays.fill(arr, -1);

        // Start with buying (1 indicates buying, 0 indicates selling)
        int buy = 0;

        return profit(prices, 0, buy, n, dp);
    }
}
