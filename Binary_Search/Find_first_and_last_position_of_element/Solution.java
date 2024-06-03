class Solution {

    public int searchFirst(int[] nums, int target) {
        
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }

            else if(nums[mid]>target) high=mid-1;

            else low=mid+1;
        }

        return ans;
    }

    public int searchLast(int[] nums, int target) {
        
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }

            else if(nums[mid]>target) high=mid-1;

            else low=mid+1;
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];

        ans[0]=searchFirst(nums,target);
        ans[1]=searchLast(nums,target);

        return ans;
    }
}
