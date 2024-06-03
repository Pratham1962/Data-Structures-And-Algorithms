class Solution {

    public static boolean possibilityCheck(int mid, int[] nums, int threshold){

        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double) nums[i]/ (double) mid);
        }

        return sum<=threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int ans=0;

        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }

        int low=1;
        int high=max;

        while(low<=high){
            int mid = low + (high - low) / 2; 

            if(possibilityCheck(mid,nums,threshold)){
                ans=mid;
                high=mid-1;
            }    
            else low=mid+1;
        }

        return ans;
    }
}

