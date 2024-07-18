class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        int prefix=0;
        map.put(0,1);
        int cnt=0;

        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];

            int required=prefix-k;

            if(map.containsKey(required)){
                cnt+=map.get(required);
            }

            map.put(prefix, map.getOrDefault(prefix,0)+1);
        }

        return cnt;
    }
}
