class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int n=nums.length;
        int m=nums[0].length;

        int low=0;
        int high=n*m-1;

        while(low<=high){
            int mid=(low+high)/2;

            int row=mid/m;
            int col=mid%m;

            if(nums[row][col]==target) return true;

            else if(nums[row][col]>target) high=mid-1;

            else low=mid+1;
        }

        return false;
    }
}
