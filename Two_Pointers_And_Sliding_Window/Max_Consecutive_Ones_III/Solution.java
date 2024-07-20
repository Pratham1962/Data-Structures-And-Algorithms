class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int low=0;
        int high=0;
        int cnt=0;
        int max=0;
        int n=nums.length;

        while(high<n){

            if(nums[high]==0) cnt++;

            while(cnt>k){
                
                if(nums[low]==0) cnt--;
                low++;
            }

            max=Math.max(max,high-low+1);
            high++;
            
        }

        return max;

    }
}
