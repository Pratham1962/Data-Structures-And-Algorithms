class Solution {
    public int jump(int[] nums) {

        int n=nums.length;
        if(n<=1) return 0;

        int coverage=nums[0];
        int max=0;
        int jumps=0;
        int lastIdx=0;

        for(int i=0;i<n;i++){

            coverage=Math.max(coverage,nums[i]+i);

            if(i==lastIdx){
                jumps++;
                lastIdx=coverage;

                if(lastIdx>=n-1) return jumps;
            }

        }

        return jumps;
    }
}
