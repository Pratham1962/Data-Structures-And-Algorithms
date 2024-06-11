class Solution {

    public static int length(int[] nums,int prev, int idx, int n, int[][] dp){
        if(idx==n) return 0;

        if(dp[idx][prev+1]!=-1) return dp[idx][prev+1];

        int take=0;

        if(prev==-1 || nums[idx]>nums[prev]) take=1+length(nums, idx,idx+1, n,dp);

        int notTake=0+length(nums, prev,idx+1, n,dp);

        return dp[idx][prev+1]=Math.max(take,notTake);

    }

    public int lengthOfLIS(int[] nums) {
        
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int[] arr: dp) Arrays.fill(arr,-1);

        return length(nums,-1,0,n,dp);
    }
}
