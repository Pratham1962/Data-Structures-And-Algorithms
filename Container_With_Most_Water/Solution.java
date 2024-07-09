class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int low=0;
        int high=n-1;

        int max=0;

        while(low<high){

            int area=(high-low)*Math.min(height[low],height[high]);

            max=Math.max(max,area);

            if(height[low]<height[high]){
                low++;
            }

            else{
                high--;
            }
        }

        return max;
    }
}
