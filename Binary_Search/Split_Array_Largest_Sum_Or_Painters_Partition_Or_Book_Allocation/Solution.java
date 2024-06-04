class Solution {
   
    public static boolean days(int[] arr, int mid,int k){
        
        int subarrays=1;
        int sum=0;

        for(int i=0;i<arr.length;i++){

            sum+=arr[i];
            if(mid<sum){
                sum=arr[i];
                subarrays++;
            } 
        }

        return subarrays<=k;
    }
   
    public int splitArray(int[] nums, int k) {
       
        int low=Integer.MIN_VALUE, high=0;
        for(int i=0;i<nums.length;i++){
            high+=nums[i];
            low=Math.max(low,nums[i]);
        }

        while(low<=high){
            int mid=(low+high)/2;

            if(days(nums,mid,k)){
                high=mid-1;
            }

            else{
                low=mid+1;
            }
        }

        return low;
    }
}

