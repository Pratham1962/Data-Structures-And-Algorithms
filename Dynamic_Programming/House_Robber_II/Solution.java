class Solution {
    
    public static int sum(int index, int[] nums, int[] dp){

        if(index==0) return nums[0];
        if(index<0) return 0;

        if(dp[index]!=-1) return dp[index];

        int leftMax= nums[index]+sum(index-2,nums,dp);
        int rightMax=0+sum(index-1,nums,dp);
        dp[index]=Math.max(leftMax,rightMax);
        return Math.max(leftMax,rightMax);
    }
    
    public int rob(int[] nums) {
        
        int n=nums.length;
        if(n==1) return nums[0];

        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        int[] arr1=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr1[i]=nums[i];
        }
        int withFirst= sum(arr1.length-1,arr1,dp);

        int[] arr2=new int[n-1];
        
        int j=0;

        for(int i=1;i<n;i++){
            arr2[j++]=nums[i];
        }

        Arrays.fill(dp,-1);

        int withoutFirst= sum(arr2.length-1,arr2,dp);

        return Math.max(withoutFirst, withFirst);
    }
}
