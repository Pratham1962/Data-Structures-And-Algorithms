class Solution {

    public static int stairCount(int n, int[] dp){
        
        if(n==0) return 1;
        if (n<0) return 0;

        if(dp[n]!=-1) return dp[n];

        dp[n]=stairCount(n-2,dp)+stairCount(n-1,dp);

        return dp[n];
    }

    public int climbStairs(int n) {

        int[] dp=new int[n+1];
        
        Arrays.fill(dp,-1);
        return stairCount(n, dp);
    }
}
