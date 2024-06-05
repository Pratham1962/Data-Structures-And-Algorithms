class Solution {

    public static void subset(int idx, int[] arr, List<List<Integer>> ans, List<Integer> temp){
        ans.add(new ArrayList<>(temp));
        for(int i=idx; i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            temp.add(arr[i]);
            subset(i+1, arr, ans, temp);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subset(0, nums, ans, temp);
        return ans;
    }
}

