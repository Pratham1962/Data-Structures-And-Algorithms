class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int cnt=1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]-1){
                cnt++;
            }

            else{
                max=Math.max(cnt,max);
                cnt=1;
            }
        }
        max=Math.max(cnt,max);

        return max;
    }
}
