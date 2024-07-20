class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        int high=0;
        int low=0;
        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        int max=0;

        while(high<n){

            map.put(nums[high], map.getOrDefault(nums[high],0)+1);

            while(map.get(nums[high])>k){
                map.put(nums[low], map.get(nums[low])-1);
                low++;


            }

            max=Math.max(max, high-low+1);
            high++;
        }

        return max;
    }
}
