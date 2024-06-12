class Solution {

    static int dp[];

    public void solve(int idx, int[] nums, List<Integer> result,
                         List<Integer> temp, int prev) {

        if (idx >= nums.length) {
            if (temp.size() > result.size()) {
                result.clear();
                result.addAll(temp);
            }
            return;
        }

        if (temp.size()>dp[idx] && (prev == -1 || nums[idx] % prev == 0)) {
            dp[idx]=temp.size();
            temp.add(nums[idx]);
            solve(idx + 1, nums, result, temp, nums[idx]);
            temp.remove(temp.size() - 1);
        }
        solve(idx + 1, nums, result, temp, prev);
    }

    public List<Integer> largestDivisibleSubset(int[] nums) {
        
       Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int prev = -1;

        solve(0, nums, result, temp, prev);
     
        return result;
    }
}
