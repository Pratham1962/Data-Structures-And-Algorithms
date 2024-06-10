
class Solution {

    public static int sum(int index, int n, int[] nums, int target, int sum){
       
        if(index==n){
            if(sum==target) return 1;
            else return 0;
        }

        int left= sum(index+1, n,nums,target,sum+nums[index]);
        int right=sum(index+1, n,nums,target,sum-nums[index]);

        return left+right;

    }

    public int findTargetSumWays(int[] nums, int target) {
       
        int n=nums.length;
        return sum(0,n, nums,target,0);
    }
}

