class Solution {

    public static int count(int[] coins, int amount, int index, int[][] dp){
       
        if(index==0){
            if(amount%coins[index]==0) return amount/coins[index];
            else return (int)Math.pow(10,9);
        }

        if(dp[index][amount]!=-1) return dp[index][amount];

        int notTake=0+count(coins,amount,index-1,dp);
        int take=(int)Math.pow(10,9);

        if(coins[index]<=amount){
            take=1+count(coins,amount-coins[index],index,dp);
        }

        dp[index][amount]=Math.min(notTake, take);

        return Math.min(notTake, take);
    }
    public int coinChange(int[] coins, int amount) {
       
        int n=coins.length;

        int[][] dp=new int[n][amount+1];
        for(int[] arr:dp) Arrays.fill(arr,-1);

        int ans= count(coins, amount, n-1,dp);

        if(ans==(int)Math.pow(10,9)) return -1;

        else return ans;
    }
}



