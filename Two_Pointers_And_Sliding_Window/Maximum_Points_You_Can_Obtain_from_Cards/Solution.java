class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int n=cardPoints.length;
        int sum=0;
        int max=0;

        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }

        max=Math.max(max,sum);
        
        for(int i=0;i<k;i++){
            sum-=cardPoints[k-i-1];
            sum+=cardPoints[n-1-i];
            max=Math.max(max,sum);
        }

        return max;

    }
}
