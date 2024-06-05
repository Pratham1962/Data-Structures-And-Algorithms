class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;

        int finalIndex=n-1;

        for(int i= n-1; i>=0;i--){

            if(i+nums[i]>=finalIndex) finalIndex=i;
        }

        return finalIndex==0;
    }
}

