class Solution {
    public int maxSubArray(int[] nums) {
        
        int prefix=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            
            if(prefix<0) prefix=0;

            prefix+=nums[i];

            max=Math.max(max, prefix);
        }

        return max;
    }
}
