class Solution {

    public static boolean possibilityCheck(int capacity,int[] weights,int days){
        
        int dayReq=1;
        int sum=0;

        for(int i=0;i<weights.length;i++){

            sum+=weights[i];

            if(sum>capacity) {
                sum=weights[i];
                dayReq++;
            }
        }

        return dayReq<=days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=Integer.MIN_VALUE;
        int ans=0;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=weights[i];
            max=Math.max(max,weights[i]);
        }

        int low=max;
        int high=sum;

        while(low<=high){
            int mid = low + (high - low) / 2; 

            if(possibilityCheck(mid,weights,days)){
                ans=mid;
                high=mid-1;
            }    
            else low=mid+1;
        }

        return ans;
    }
}
