class Solution {

    public static boolean subset(int[] nums, int n, int target,int[][] dp){
        
        if(target==0) return true;
        if(n==0) return (target==nums[n]);

        if(dp[n][target]!=-1){
            return (dp[n][target]==0)?true:false;
        }

        boolean notTake=subset(nums, n-1, target,dp);

        boolean take=false;
        if(nums[n]<=target) {
            take=subset(nums, n-1, target-nums[n],dp);
        }

        dp[n][target]=(take || notTake)?0:1;

        return (take || notTake);
    }

    public boolean canPartition(int[] nums) {
        
        int n=nums.length;
        int sum=0;
        int target=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        if(sum%2!=0) return false;
        
        int[][] dp=new int[n][sum/2+1];

        for(int[] arr:dp) Arrays.fill(arr,-1);

        return subset(nums,n-1,sum/2,dp);
    }
}
