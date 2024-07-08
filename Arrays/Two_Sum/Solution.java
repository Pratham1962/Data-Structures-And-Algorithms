class Solution {
    public int[] twoSum(int[] arr, int target) {
       
        int n=arr.length;
        HashMap<Integer,Integer> map= new HashMap<>();

        int[] ans= new int[2];
        ans[0]=ans[1]=-1;

        for(int i=0;i<n;i++){
            int needed= target-arr[i];
            if(map.containsKey(needed)){
                ans[0]=i;
                ans[1]=map.get(needed);
            }

            map.put(arr[i],i);
        }

        return ans;
    }
}

