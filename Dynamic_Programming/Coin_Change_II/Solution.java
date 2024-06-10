class Solution {

    public static int count(int n, int[] coins, int amount, int[][] dp){

        if(n<=0){
            if(n==0){
                if(amount%coins[n]==0) return 1;
            }
            return 0;
        } 

        if(dp[n][amount]!=-1) return dp[n][amount];
        
        int take=0;
        if(coins[n]<=amount){
            take=count(n,coins,amount-coins[n],dp);
        }

        int notTake=count(n-1,coins,amount,dp);

        return dp[n][amount]=take+notTake;
    }

    public int change(int amount, int[] coins) {
        
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        
        for(int[] arr: dp) Arrays.fill(arr,-1);

        int ans=count(n-1,coins,amount,dp);

        return ans;
    }
}
