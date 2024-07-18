class Solution {

    public int findMaxLength(int[] nums) {
        
        int n = nums.length;

        int prefixSum = 0;
        Map<Integer,Integer> map = new HashMap();
   

        for(int i=0;i<n;i++){
            if(nums[i]==0) nums[i]=-1;
        }
        
        int max=0;
        
        for(int i=0; i<n; i++){
            prefixSum += nums[i];
            
            if(prefixSum==0){
                max=Math.max(max,i+1);
            }

            if(map.containsKey(prefixSum)){
                int number=(i)-map.get(prefixSum);
                max=Math.max(max,number);
            }

            else{
                map.put(prefixSum, i);
            }
            
        }
        return max;
    }
}
