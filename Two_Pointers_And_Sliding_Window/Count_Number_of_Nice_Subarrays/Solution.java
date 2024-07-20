class Solution {

    public static int countSum(int[] nums, int goal){

        if(goal<0) return 0;

        int low=0;
        int high=0;
        int n=nums.length;
        int sum=0;
        int cnt=0;

        while(high<n){
            sum+=nums[high]%2;

            while(sum>goal){
                sum-=nums[low]%2;
                low++;
            }

            cnt+=high-low+1;
            high++;
        }

        return cnt;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return countSum(nums,k)-countSum(nums,k-1);
    }
}
