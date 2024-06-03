class Solution {

    public static boolean possibilityCheck(int mid, int[] piles, int h){

        long time=0;

        for(int i=0;i<piles.length;i++){
            time+=Math.ceil((double) piles[i]/ (double) mid);
        }

        return time<=h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        int ans=0;

        for(int i=0;i<n;i++){
            max=Math.max(max,piles[i]);
        }

        int low=1;
        int high=max;

        while(low<=high){
            int mid = low + (high - low) / 2; 

            if(possibilityCheck(mid,piles,h)){
                ans=mid;
                high=mid-1;
            }    
            else low=mid+1;
        }

        return ans;
    }
}
