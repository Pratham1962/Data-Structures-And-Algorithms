class Solution {

    public int maxAmount(int[] nums, int n,int[] dp){

        if(n==0) return nums[0];
        if(n<0) return 0;

        if(dp[n]!=-1) return dp[n];

        int pick=nums[n]+maxAmount(nums,n-2,dp);
        int notPick=maxAmount(nums,n-1,dp);

        return dp[n]=Math.max(pick,notPick);
    }

    public int rob(int[] nums) {
        int n=nums.length-1;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        return maxAmount(nums,n,dp);
    }
}
